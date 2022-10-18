package typings.cypress.typesNetStubbingMod

import typings.cypress.anon.OmitRouteMatcherOptionsur
import typings.cypress.anon.PartialWaitOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Cypress {
    
    // TODO: Why is Subject unused?
    // eslint-disable-next-line @typescript-eslint/no-unused-vars
    @js.native
    trait Chainable[Subject] extends StObject {
      
      /**
        * Use `cy.intercept()` to stub and intercept HTTP requests and responses.
        *
        * @see https://on.cypress.io/intercept
        * @example
        *    cy.intercept('GET', 'http://foo.com/fruits', ['apple', 'banana', 'cherry'])
        */
      def intercept(method: Method, url: RouteMatcher): Chainable[Null] = js.native
      def intercept(method: Method, url: RouteMatcher, response: RouteHandler): Chainable[Null] = js.native
      /**
        * Use `cy.intercept()` to stub and intercept HTTP requests and responses.
        *
        * @see https://on.cypress.io/intercept
        * @example
        *    cy.intercept('https://localhost:7777/users', [{id: 1, name: 'Pat'}])
        * @example
        *    cy.intercept('https://localhost:7777/protected-endpoint', (req) => {
        *      req.headers['authorization'] = 'basic fooabc123'
        *    })
        * @example
        *    cy.intercept('https://localhost:7777/some-response', (req) => {
        *      req.continue(res => {
        *        res.body = 'some new body'
        *      })
        *    })
        */
      def intercept(url: RouteMatcher): Chainable[Null] = js.native
      def intercept(url: RouteMatcher, response: RouteHandler): Chainable[Null] = js.native
      /**
        * Use `cy.intercept()` to stub and intercept HTTP requests and responses.
        *
        * @see https://on.cypress.io/intercept
        *
        * @example
        *    cy.intercept('/fruits', { middleware: true }, (req) => { ... })
        *
        * @param mergeRouteMatcher Additional route matcher options to merge with `url`. Typically used for middleware.
        */
      def intercept(url: StringMatcher, mergeRouteMatcher: OmitRouteMatcherOptionsur, response: RouteHandler): Chainable[Null] = js.native
      
      /**
        * Wait for a specific request to complete.
        *
        * @see https://on.cypress.io/wait
        * @param {string} alias - Name of the alias to wait for.
        *
        ```
        // Wait for the route aliased as 'getAccount' to respond
        // without changing or stubbing its response
        cy.intercept('https://api.example.com/accounts/ *').as('getAccount')
        cy.visit('/accounts/123')
        cy.wait('@getAccount').then((interception) => {
        // we can now access the low level request
        // that contains the request body,
        // response body, status, etc
        })
        ```
        */
      def wait(alias: String): Chainable[Interception] = js.native
      def wait(alias: String, options: PartialWaitOptions): Chainable[Interception] = js.native
      /**
        * Wait for list of requests to complete.
        *
        * @see https://on.cypress.io/wait
        * @param {string[]} aliases - An array of aliased routes as defined using the `.as()` command.
        *
        ```
        // wait for 3 XHR requests to complete
        cy.intercept('users/ *').as('getUsers')
        cy.intercept('activities/ *').as('getActivities')
        cy.intercept('comments/ *').as('getComments')
        cy.visit('/dashboard')
        cy.wait(['@getUsers', '@getActivities', '@getComments'])
        .then((interceptions) => {
        // intercepts will now be an array of matching HTTP requests
        })
        ```
        */
      def wait(alias: js.Array[String]): Chainable[js.Array[Interception]] = js.native
      def wait(alias: js.Array[String], options: PartialWaitOptions): Chainable[js.Array[Interception]] = js.native
    }
  }
}
