package typings.chaiFs.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deep extends js.Object {
  
  def contents(array: js.Array[_]): Assertion = js.native
  def contents(array: js.Array[_], msg: String): Assertion = js.native
  
  def files(array: js.Array[_]): Assertion = js.native
  def files(array: js.Array[_], msg: String): Assertion = js.native
  
  def subDirs(array: js.Array[_]): Assertion = js.native
  def subDirs(array: js.Array[_], msg: String): Assertion = js.native
}
