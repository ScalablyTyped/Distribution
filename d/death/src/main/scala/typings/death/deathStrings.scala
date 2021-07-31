package typings.death

import typings.death.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deathStrings {
  
  @js.native
  sealed trait SIGINT
    extends StObject
       with Signal
  @scala.inline
  def SIGINT: SIGINT = "SIGINT".asInstanceOf[SIGINT]
  
  @js.native
  sealed trait SIGQUIT
    extends StObject
       with Signal
  @scala.inline
  def SIGQUIT: SIGQUIT = "SIGQUIT".asInstanceOf[SIGQUIT]
  
  @js.native
  sealed trait SIGTERM
    extends StObject
       with Signal
  @scala.inline
  def SIGTERM: SIGTERM = "SIGTERM".asInstanceOf[SIGTERM]
}
