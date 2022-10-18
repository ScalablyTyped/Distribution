package typings.cypress.mochaMod

import typings.cypress.Mocha.Suite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaces {
  
  @JSImport("mocha", "interfaces")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bdd(suite: Suite): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bdd")(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def exports(suite: Suite): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exports")(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def qunit(suite: Suite): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("qunit")(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tdd(suite: Suite): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tdd")(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
