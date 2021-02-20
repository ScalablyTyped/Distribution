package typings.azureSb.mod.Azure

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ServiceBus {
  
  type DateString = java.lang.String
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Duration = java.lang.String
  
  type MessageOrName = typings.azureSb.mod.Azure.ServiceBus.Message | java.lang.String
  
  type ReceiveSubscriptionMessageOptions = typings.azureSb.mod.Azure.ServiceBus.ReceiveQueueMessageOptions
  
  type ResponseCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* response */ typings.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
  
  type ResultAndResponseCallback = js.Function3[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ scala.Boolean | typings.azureSb.mod.Azure.ServiceBus.Results.Models.Base | js.Array[typings.azureSb.mod.Azure.ServiceBus.Results.Models.Base], 
    /* response */ typings.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
  
  type TypedResultAndResponseCallback[T] = js.Function3[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ T, 
    /* response */ typings.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
}
