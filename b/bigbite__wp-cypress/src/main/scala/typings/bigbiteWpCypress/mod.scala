package typings.bigbiteWpCypress

import typings.bigbiteWpCypress.anon.PartialVisitOptions
import typings.bigbiteWpCypress.bigbiteWpCypressBooleans.`false`
import typings.cypress.Cypress.AUTWindow
import typings.cypress.Cypress.Exec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object Cypress {
      
      @js.native
      trait Chainable[Subject] extends StObject {
        
        /**
          * Activate a plugin.
          *
          * @param name Plugin name.
          *
          * @example cy.activatePlugin('my-plugin')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def activatePlugin(name: String): Chainable[Exec] = js.native
        
        /**
          * Activate a theme.
          *
          * @param name Theme name.
          *
          * @example cy.activateTheme('my-theme')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def activateTheme(name: String): Chainable[Exec] = js.native
        
        /**
          * Run the seeder clean method then seed the database.
          *
          * @param seeder Seed name.
          *
          * @example cy.cleanThenSeed('MySeeder')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def cleanThenSeed(seeder: String): Chainable[Exec] = js.native
        
        /**
          * De-activate a plugin.
          *
          * @param name Plugin name.
          *
          * @example cy.deactivatePlugin('my-plugin')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def deactivatePlugin(name: String): Chainable[Exec] = js.native
        
        /**
          * Visit a post's edit page.
          *
          * @param id Post ID.
          * @param [options={}] Visit options.
          *
          * @example cy.editPost(1)
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def editPost(id: Double): Chainable[AUTWindow] = js.native
        def editPost(id: Double, options: PartialVisitOptions): Chainable[AUTWindow] = js.native
        
        /**
          * Install a plugin.
          *
          * @param name Plugin name.
          *
          * @example cy.installPlugin('my-plugin')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def installPlugin(name: String): Chainable[Exec] = js.native
        
        /**
          * Install a theme.
          *
          * @param name Theme name.
          *
          * @example cy.installTheme('my-theme')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def installTheme(name: String): Chainable[Exec] = js.native
        
        /**
          * Logout from the current user.
          *
          * @example cy.logout()
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def logout(): Chainable[Exec] = js.native
        
        /**
          * Perform full teardown.
          *
          * @param [version=false] WordPress version.
          *
          * @example cy.resetWP('5.9')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def resetWP(): Chainable[Exec] = js.native
        def resetWP(version: String): Chainable[Exec] = js.native
        @JSName("resetWP")
        def resetWP_false(version: `false`): Chainable[Exec] = js.native
        
        /**
          * If on a post's edit page, save the post.
          *
          * @example cy.saveCurrentPost()
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def saveCurrentPost(): Chainable[AUTWindow] = js.native
        
        /**
          * Seed the database with the given seeder.
          *
          * @param seeder Seed name.
          *
          * @example cy.seed('MySeeder')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def seed(seeder: String): Chainable[Exec] = js.native
        
        /**
          * Run the seeder clean method.
          *
          * @param seeder Seed name.
          *
          * @example cy.seedClean('MySeeder')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def seedClean(seeder: String): Chainable[Exec] = js.native
        
        /**
          * Log in as a different user.
          *
          * @param [user='admin']  Username.
          * @param [password=null] Password.
          *
          * @example cy.switchUser('myUser', 'myPassword')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def switchUser(): Chainable[Exec] = js.native
        def switchUser(user: String): Chainable[Exec] = js.native
        def switchUser(user: String, password: String): Chainable[Exec] = js.native
        def switchUser(user: Unit, password: String): Chainable[Exec] = js.native
        
        /**
          * Visit the WordPress admin panel.
          *
          * @param [options={}] Visit options.
          *
          * @example cy.visitAdmin()
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def visitAdmin(): Chainable[AUTWindow] = js.native
        def visitAdmin(options: PartialVisitOptions): Chainable[AUTWindow] = js.native
        
        /**
          * Execute the WP CLI.
          *
          * @param command Command.
          *
          * @example cy.wp('cli version')
          *
          * @see https://github.com/bigbite/wp-cypress/wiki/Cypress-Commands
          */
        def wp(command: String): Chainable[Exec] = js.native
      }
    }
  }
}
