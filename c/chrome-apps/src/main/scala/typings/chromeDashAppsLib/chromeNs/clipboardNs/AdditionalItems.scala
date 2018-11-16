package typings
package chromeDashAppsLib.chromeNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AdditionalItems extends js.Object {
  /**
               * Content of the additional data item.
               * Either the plain text string if *type* is 'textPlain' or
               * markup string if *type* is 'textHtml'.
               * The data can not exceed 2MB.
               */
  var data: java.lang.String
  /**
               * Type of the additional data item.
               * @see DataItemType
               */
  var `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_TEXTHTML, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_TEXTHTML))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
}

