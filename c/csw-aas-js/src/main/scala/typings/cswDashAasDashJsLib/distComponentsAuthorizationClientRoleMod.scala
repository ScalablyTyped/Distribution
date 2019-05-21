package typings
package cswDashAasDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js/dist/components/authorization/ClientRole", JSImport.Namespace)
@js.native
object distComponentsAuthorizationClientRoleMod extends js.Object {
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
  var default: js.Function1[
    /* _ref */ js.Any, 
    reactLib.reactMod.DetailedReactHTMLElement[reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement], stdLib.HTMLElement]
  ] = js.native
}

