package typings.daterangepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DataRangePickerCallback = js.Function3[
    /* start */ typings.moment.mod.Moment, 
    /* end */ typings.moment.mod.Moment, 
    /* label */ java.lang.String | scala.Null, 
    scala.Unit
  ]
  
  type DateOrString = java.lang.String | typings.moment.mod.Moment | typings.std.Date
}
