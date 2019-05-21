package typings
package cswDashAasDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js/dist/components/context/AuthContext", JSImport.Namespace)
@js.native
object distComponentsContextAuthContextMod extends js.Object {
  var AuthContext: reactLib.reactMod.Context[cswDashAasDashJsLib.Anon_Auth] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(Consumer) */ var Provider: reactLib.reactMod.ProviderExoticComponent[reactLib.reactMod.ProviderProps[cswDashAasDashJsLib.Anon_Auth]] = js.native
  /**
    * Default state for AuthContextProvider
    * @type {{auth: undefined, login: (function(): boolean), logout: (function(): boolean)}}
    */
  @js.native
  object AuthContextDefaultState extends js.Object {
    var auth: scala.Null = js.native
    def login(): scala.Unit = js.native
    def logout(): scala.Unit = js.native
  }
  
}

