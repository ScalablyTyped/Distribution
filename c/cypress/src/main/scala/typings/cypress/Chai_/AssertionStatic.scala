package typings.cypress.Chai_

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertionStatic
  extends AssertionPrototype
     with Instantiable1[/* target */ js.Any, Assertion]
     with Instantiable2[/* target */ js.Any, /* message */ String, Assertion]
     with Instantiable3[/* target */ js.Any, /* message */ String, /* ssfi */ js.Function, Assertion]
     with Instantiable4[
      /* target */ js.Any, 
      /* message */ String, 
      /* ssfi */ js.Function, 
      /* lockSsfi */ Boolean, 
      Assertion
    ] {
  // Deprecated properties:
  var includeStack: Boolean = js.native
  var showDiff: Boolean = js.native
  def addChainableMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): Unit = js.native
  def addChainableMethod(
    name: String,
    method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit],
    chainingBehavior: js.Function0[Unit]
  ): Unit = js.native
  def addMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, _]): Unit = js.native
  // Partials of functions on ChaiUtils:
  def addProperty(name: String, getter: js.ThisFunction0[/* this */ this.type, _]): Unit = js.native
  def overwriteChainableMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): Unit = js.native
  def overwriteChainableMethod(
    name: String,
    method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit],
    chainingBehavior: js.Function0[Unit]
  ): Unit = js.native
  def overwriteMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, _]): Unit = js.native
  def overwriteProperty(name: String, getter: js.ThisFunction0[/* this */ this.type, _]): Unit = js.native
}

