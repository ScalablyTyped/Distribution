package typings.cypress.Chai

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertionStatic
  extends StObject
     with AssertionPrototype
     with Instantiable1[/* target */ Any, Assertion]
     with Instantiable2[/* target */ Any, /* message */ String, Assertion]
     with Instantiable3[
      /* target */ Any, 
      (/* message */ String) | (/* message */ Unit), 
      /* ssfi */ js.Function, 
      Assertion
    ]
     with Instantiable4[
      /* target */ Any, 
      (/* message */ String) | (/* message */ Unit), 
      (/* ssfi */ js.Function) | (/* ssfi */ Unit), 
      /* lockSsfi */ Boolean, 
      Assertion
    ] {
  
  def addChainableMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): Unit = js.native
  def addChainableMethod(
    name: String,
    method: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit],
    chainingBehavior: js.Function0[Unit]
  ): Unit = js.native
  
  def addMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Any]): Unit = js.native
  
  // Partials of functions on ChaiUtils:
  def addProperty(name: String, getter: js.ThisFunction0[/* this */ this.type, Any]): Unit = js.native
  
  // Deprecated properties:
  var includeStack: Boolean = js.native
  
  def overwriteChainableMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): Unit = js.native
  def overwriteChainableMethod(
    name: String,
    method: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit],
    chainingBehavior: js.Function0[Unit]
  ): Unit = js.native
  
  def overwriteMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Any]): Unit = js.native
  
  def overwriteProperty(name: String, getter: js.ThisFunction0[/* this */ this.type, Any]): Unit = js.native
  
  var showDiff: Boolean = js.native
}
