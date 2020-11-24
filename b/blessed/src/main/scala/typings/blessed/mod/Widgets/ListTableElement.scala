package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.ListTableElement")
@js.native
class ListTableElement protected () extends ListElement {
  def this(opts: ListTableOptions) = this()
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_ListTableElement: ListTableOptions = js.native
  
  /**
    * Set rows in table. Array of arrays of strings.
    * @example:
    *
    * table.setData([
    *      [ 'Animals',  'Foods'  ],
    *      [ 'Elephant', 'Apple'  ],
    *      [ 'Bird',     'Orange' ]
    *  ]);
    */
  def setData(rows: js.Array[js.Array[String]]): Unit = js.native
  
  /**
    * Set rows in table. Array of arrays of strings.
    * @example:
    *
    * table.setData([
    *      [ 'Animals',  'Foods'  ],
    *      [ 'Elephant', 'Apple'  ],
    *      [ 'Bird',     'Orange' ]
    *  ]);
    */
  def setRows(rows: js.Array[js.Array[String]]): Unit = js.native
}
