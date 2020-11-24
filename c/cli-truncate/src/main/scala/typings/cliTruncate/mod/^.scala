package typings.cliTruncate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cli-truncate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Truncate a string to a specific width in the terminal.
  @param text - Text to truncate.
  @param columns - Columns to occupy in the terminal.
  @example
  ```
  import cliTruncate = require('cli-truncate');
  cliTruncate('unicorn', 4);
  //=> 'uni…'
  // Truncate at different positions
  cliTruncate('unicorn', 4, {position: 'start'});
  //=> '…orn'
  cliTruncate('unicorn', 4, {position: 'middle'});
  //=> 'un…n'
  cliTruncate('\\u001B[31municorn\\u001B[39m', 4);
  //=> '\\u001B[31muni\\u001B[39m…'
  // Truncate Unicode surrogate pairs
  cliTruncate('uni\\uD83C\\uDE00corn', 5);
  //=> 'uni\\uD83C\\uDE00…'
  // Truncate fullwidth characters
  cliTruncate('안녕하세요', 3);
  //=> '안…'
  // Truncate the paragraph to the terminal width
  const paragraph = 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.';
  cliTruncate(paragraph, process.stdout.columns));
  //=> 'Lorem ipsum dolor sit amet, consectetuer adipiscing…'
  ```
  */
  def apply(text: String, columns: Double): String = js.native
  def apply(text: String, columns: Double, options: Options): String = js.native
}
