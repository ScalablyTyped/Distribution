package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ext internal"

trait ExtTypeSettings extends js.Object {
  /**
           * Type detection functions for plug-in development.
           *
           * @see https://datatables.net/manual/plug-ins/type-detection
           */
  var detect: js.Array[FunctionExtTypeSettingsDetect]
  /**
           * Type based ordering functions for plug-in development.
           *
           * @see https://datatables.net/manual/plug-ins/sorting
           * @default {}
           */
  var order: js.Object
  /**
           * Type based search formatting for plug-in development.
           *
           * @default {}
           * @example
           *   $.fn.dataTable.ext.type.search['title-numeric'] = function ( d ) {
           *     return d.replace(/\n/g," ").replace( /<.*?>/g, "" );
           *   }
           */
  var search: js.Object
}

