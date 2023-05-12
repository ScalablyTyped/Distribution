package typings.cucumberCucumber

import typings.node.processMod.global.NodeJS.UncaughtExceptionListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUncaughtExceptionManagerMod {
  
  object default {
    
    @JSImport("@cucumber/cucumber/lib/uncaught_exception_manager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerHandler(handler: UncaughtExceptionListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unregisterHandler(handler: UncaughtExceptionListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
