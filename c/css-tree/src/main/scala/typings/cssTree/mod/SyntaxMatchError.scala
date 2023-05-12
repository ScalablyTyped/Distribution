package typings.cssTree.mod

import typings.cssTree.anon.End
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-tree", "SyntaxMatchError")
@js.native
open class SyntaxMatchError ()
  extends StObject
     with Error {
  
  var column: Double = js.native
  
  var css: String = js.native
  
  var line: Double = js.native
  
  var loc: End = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  var mismatchLength: Double = js.native
  
  var mismatchOffset: Double = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var offset: Double = js.native
  
  var rawMessage: String = js.native
  
  var syntax: String = js.native
}
