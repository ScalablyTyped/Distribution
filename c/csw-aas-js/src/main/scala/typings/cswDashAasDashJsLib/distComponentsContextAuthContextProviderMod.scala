package typings
package cswDashAasDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js/dist/components/context/AuthContextProvider", JSImport.Namespace)
@js.native
object distComponentsContextAuthContextProviderMod extends js.Object {
  /**
    * React component which is wrapper over provider of react context api.
    * Responsible for instantiating keycloak and provide context value to consumers
    * props -
    * config json specific to UI application e.g. realm and clientId
    * children - react component or html element which can have consumer to access
    * context provided
    */
  var default: js.Function1[
    /* props */ js.Any, 
    reactLib.reactMod.FunctionComponentElement[
      reactLib.reactMod.ProviderProps[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_csw-aas-js/dist/components/context/AuthContext.AuthContextType */ js.Any
      ]
    ]
  ] = js.native
}

