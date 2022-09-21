package typings.concurrently

import typings.concurrently.completionListenerMod.SuccessCondition
import typings.concurrently.killOthersMod.ProcessCloseCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concurrentlyStrings {
  
  @js.native
  sealed trait `Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`
    extends StObject
       with SuccessCondition
  inline def `Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`: `Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket` = ("!command-${string | number}").asInstanceOf[`Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`]
  
  @js.native
  sealed trait all
    extends StObject
       with SuccessCondition
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait `command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`
    extends StObject
       with SuccessCondition
  inline def `command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`: `command-$Leftcurlybracketstring Verticalline numberRightcurlybracket` = ("command-${string | number}").asInstanceOf[`command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`]
  
  @js.native
  sealed trait failure
    extends StObject
       with ProcessCloseCondition
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait first
    extends StObject
       with SuccessCondition
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait last
    extends StObject
       with SuccessCondition
  inline def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait success
    extends StObject
       with ProcessCloseCondition
  inline def success: success = "success".asInstanceOf[success]
}
