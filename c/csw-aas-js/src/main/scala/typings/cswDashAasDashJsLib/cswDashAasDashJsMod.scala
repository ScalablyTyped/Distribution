package typings
package cswDashAasDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js", JSImport.Namespace)
@js.native
object cswDashAasDashJsMod extends js.Object {
  var AuthContext: reactLib.reactMod.Context[cswDashAasDashJsLib.Anon_Auth] = js.native
  /**
    * React component which is wrapper over provider of react context api.
    * Responsible for instantiating keycloak and provide context value to consumers
    * props -
    * config json specific to UI application e.g. realm and clientId
    * children - react component or html element which can have consumer to access
    * context provided
    */
  var AuthContextProvider: js.Function1[
    /* props */ js.Any, 
    reactLib.reactMod.FunctionComponentElement[
      reactLib.reactMod.ProviderProps[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_csw-aas-js/dist/components/context/AuthContext.AuthContextType */ js.Any
      ]
    ]
  ] = js.native
  /**
    * React component which renders children if authenticated and error if unauthenticated
    * @param children (optional prop) can be react components or html element which will be rendered
    * if user is authenticated
    * @param error (optional prop) can be react components or html element which will be rendered
    * if user is not authenticated
    */
  var CheckLogin: js.Function1[
    /* _ref */ js.Any, 
    reactLib.reactMod.DetailedReactHTMLElement[reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement], stdLib.HTMLElement]
  ] = js.native
  /**
    * React component which renders if user is authenticated and has specified client role
    * @param clientRole (required prop) string which specifies expected client role
    * @param client (optional prop) string which specifies expected client.If not specified, `clientId` is used.
    * @param children (optional prop) can be react components or html element which will be rendered
    * if user is authenticated and has specified client role
    * @param error (optional prop) can be react components or html element which will be rendered
    * if user is not authenticated or does not have specified client role
    * @returns React component
    */
  var ClientRole: js.Function1[
    /* _ref */ js.Any, 
    reactLib.reactMod.DetailedReactHTMLElement[reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement], stdLib.HTMLElement]
  ] = js.native
  /**
    * React component which renders Login button.
    */
  var Login: js.Function0[
    reactLib.reactMod.DetailedReactHTMLElement[cswDashAasDashJsLib.Anon_Id, stdLib.HTMLElement]
  ] = js.native
  /**
    * React component which renders Logout button.
    */
  var Logout: js.Function0[
    reactLib.reactMod.DetailedReactHTMLElement[cswDashAasDashJsLib.Anon_Id, stdLib.HTMLElement]
  ] = js.native
  /**
    * React component which renders if user is authenticated and has specified realm role
    * @param realmRole (required prop) string which specifies expected realm role
    * @param children (optional prop) can be react components or html element which will be rendered
    * if user is authenticated and has specified realm role
    * @param error (optional prop) can be react components or html element which will be rendered
    * if user is not authenticated or does not have specified realm role
    * @returns React component
    */
  var RealmRole: js.Function1[
    /* _ref */ js.Any, 
    reactLib.reactMod.DetailedReactHTMLElement[reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement], stdLib.HTMLElement]
  ] = js.native
}

