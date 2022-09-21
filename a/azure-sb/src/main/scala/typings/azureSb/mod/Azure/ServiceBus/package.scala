package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StringDictionary
import typings.azureSb.mod.Azure.ServiceBus.Results.Models.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DateString = String

type Dictionary[T] = StringDictionary[T]

type Duration = String

type MessageOrName = Message | String

type ReceiveSubscriptionMessageOptions = ReceiveQueueMessageOptions

type ResponseCallback = js.Function2[/* error */ js.Error | Null, /* response */ Response, Unit]

type ResultAndResponseCallback = js.Function3[
/* error */ js.Error | Null, 
/* result */ Boolean | Base | js.Array[Base], 
/* response */ Response, 
Unit]

type TypedResultAndResponseCallback[T] = js.Function3[/* error */ js.Error | Null, /* result */ T, /* response */ Response, Unit]
