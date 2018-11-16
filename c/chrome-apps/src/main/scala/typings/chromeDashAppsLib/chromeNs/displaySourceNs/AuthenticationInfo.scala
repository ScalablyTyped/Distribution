package typings
package chromeDashAppsLib.chromeNs.displaySourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthenticationInfo extends js.Object {
  /**
               * Authentication data (e.g. PIN value).
               */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Authentication method.
               * @see AuthenticationMethod
               */
  var method: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_PBC, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_PBC))),List()),Left(TsIdentSimple(K))) */js.Any
      ]
    ]
  ] = js.undefined
}

