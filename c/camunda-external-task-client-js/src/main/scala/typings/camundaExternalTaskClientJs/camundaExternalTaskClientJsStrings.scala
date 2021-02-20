package typings.camundaExternalTaskClientJs

import typings.camundaExternalTaskClientJs.mod.ErrorEvent
import typings.camundaExternalTaskClientJs.mod.ErrorWithTaskEvent
import typings.camundaExternalTaskClientJs.mod.PollEvent
import typings.camundaExternalTaskClientJs.mod.SuccessWithTaskEvent
import typings.camundaExternalTaskClientJs.mod.TopicEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camundaExternalTaskClientJsStrings {
  
  @js.native
  sealed trait completeColonerror extends ErrorEvent
  @scala.inline
  def completeColonerror: completeColonerror = "complete:error".asInstanceOf[completeColonerror]
  
  @js.native
  sealed trait completeColonsuccess extends SuccessWithTaskEvent
  @scala.inline
  def completeColonsuccess: completeColonsuccess = "complete:success".asInstanceOf[completeColonsuccess]
  
  @js.native
  sealed trait extendLockColonerror extends ErrorWithTaskEvent
  @scala.inline
  def extendLockColonerror: extendLockColonerror = "extendLock:error".asInstanceOf[extendLockColonerror]
  
  @js.native
  sealed trait extendLockColonsuccess extends SuccessWithTaskEvent
  @scala.inline
  def extendLockColonsuccess: extendLockColonsuccess = "extendLock:success".asInstanceOf[extendLockColonsuccess]
  
  @js.native
  sealed trait handleBpmnErrorColonerror extends ErrorWithTaskEvent
  @scala.inline
  def handleBpmnErrorColonerror: handleBpmnErrorColonerror = "handleBpmnError:error".asInstanceOf[handleBpmnErrorColonerror]
  
  @js.native
  sealed trait handleBpmnErrorColonsuccess extends SuccessWithTaskEvent
  @scala.inline
  def handleBpmnErrorColonsuccess: handleBpmnErrorColonsuccess = "handleBpmnError:success".asInstanceOf[handleBpmnErrorColonsuccess]
  
  @js.native
  sealed trait handleFailureColonerror extends ErrorWithTaskEvent
  @scala.inline
  def handleFailureColonerror: handleFailureColonerror = "handleFailure:error".asInstanceOf[handleFailureColonerror]
  
  @js.native
  sealed trait handleFailureColonsuccess extends SuccessWithTaskEvent
  @scala.inline
  def handleFailureColonsuccess: handleFailureColonsuccess = "handleFailure:success".asInstanceOf[handleFailureColonsuccess]
  
  @js.native
  sealed trait pollColonerror extends ErrorEvent
  @scala.inline
  def pollColonerror: pollColonerror = "poll:error".asInstanceOf[pollColonerror]
  
  @js.native
  sealed trait pollColonstart extends PollEvent
  @scala.inline
  def pollColonstart: pollColonstart = "poll:start".asInstanceOf[pollColonstart]
  
  @js.native
  sealed trait pollColonstop extends PollEvent
  @scala.inline
  def pollColonstop: pollColonstop = "poll:stop".asInstanceOf[pollColonstop]
  
  @js.native
  sealed trait pollColonsuccess extends StObject
  @scala.inline
  def pollColonsuccess: pollColonsuccess = "poll:success".asInstanceOf[pollColonsuccess]
  
  @js.native
  sealed trait subscribe extends TopicEvent
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait unlockColonerror extends ErrorWithTaskEvent
  @scala.inline
  def unlockColonerror: unlockColonerror = "unlock:error".asInstanceOf[unlockColonerror]
  
  @js.native
  sealed trait unlockColonsuccess extends SuccessWithTaskEvent
  @scala.inline
  def unlockColonsuccess: unlockColonsuccess = "unlock:success".asInstanceOf[unlockColonsuccess]
  
  @js.native
  sealed trait unsubscribe extends TopicEvent
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
}
