package typings
package detectDashIndentLib.detectDashIndentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-indent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Detect the indentation of code.
  @param string - A string of any kind of text.
  @example
  ```
  import * as fs from 'fs';
  import detectIndent = require('detect-indent');
  // {
  //     "ilove": "pizza"
  // }
  const file = fs.readFileSync('foo.json', 'utf8');
  // Tries to detect the indentation and falls back to a default if it can't
  const indent = detectIndent(file).indent || '    ';
  const json = JSON.parse(file);
  json.ilove = 'unicorns';
  fs.writeFileSync('foo.json', JSON.stringify(json, null, indent));
  // {
  //     "ilove": "unicorns"
  // }
  ```
  */
  def apply(string: java.lang.String): Indent = js.native
}

