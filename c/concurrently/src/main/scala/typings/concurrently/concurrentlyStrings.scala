package typings.concurrently

import typings.concurrently.completionListenerMod._SuccessCondition
import typings.concurrently.killOthersMod.ProcessCloseCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concurrentlyStrings {
  
  @js.native
  sealed trait all
    extends StObject
       with _SuccessCondition
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait failure
    extends StObject
       with ProcessCloseCondition
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait first
    extends StObject
       with _SuccessCondition
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait last
    extends StObject
       with _SuccessCondition
  inline def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait success
    extends StObject
       with ProcessCloseCondition
  inline def success: success = "success".asInstanceOf[success]
}
