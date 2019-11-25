package typings.chaiDashArrays.chaiDashArraysMod._Global_

import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import typings.chaiDashArrays.chaiDashArraysMod._Global_.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Assert extends js.Object {
    def array(`val`: js.Array[_]): Unit = js.native
    def array(`val`: js.Array[_], msg: String): Unit = js.native
    def containing(`val`: js.Array[_], value: js.Any): Unit = js.native
    def containing(`val`: js.Array[_], value: js.Any, msg: String): Unit = js.native
    def containingAllOf(`val`: js.Array[_], values: js.Array[_]): Unit = js.native
    def containingAllOf(`val`: js.Array[_], values: js.Array[_], msg: String): Unit = js.native
    def containingAnyOf(`val`: js.Array[_], values: js.Array[_]): Unit = js.native
    def containingAnyOf(`val`: js.Array[_], values: js.Array[_], msg: String): Unit = js.native
    def equalTo(`val`: js.Array[_], array: js.Array[_]): Unit = js.native
    def equalTo(`val`: js.Array[_], array: js.Array[_], msg: String): Unit = js.native
    def ofSize(`val`: js.Array[_], size: Double): Unit = js.native
    def ofSize(`val`: js.Array[_], size: Double, msg: String): Unit = js.native
    def sorted(`val`: js.Array[_]): Unit = js.native
    def sorted(`val`: js.Array[_], msg: String): Unit = js.native
  }
  
  @js.native
  trait Assertion
    extends LanguageChains
       with NumericComparison
       with TypeComparison {
    def array(): Assertion = js.native
    def containing(value: js.Any): Assertion = js.native
    def containingAllOf(values: js.Array[_]): Assertion = js.native
    def containingAnyOf(values: js.Array[_]): Assertion = js.native
    def equalTo(arr: js.Array[_]): Assertion = js.native
    def ofSize(size: Double): Assertion = js.native
    def sorted(): Assertion = js.native
  }
  
}

