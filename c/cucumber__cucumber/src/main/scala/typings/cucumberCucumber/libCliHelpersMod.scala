package typings.cucumberCucumber

import typings.cucumberCucumber.anon.EventBroadcaster
import typings.cucumberCucumber.libFormatterHelpersMod.EventDataCollector
import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.cucumberCucumber.libModelsPickleOrderMod.PickleOrder
import typings.cucumberCucumber.libPickleFilterMod.default
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCliHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/cli/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emitMetaMessage(eventBroadcaster: EventEmitter, env: ProcessEnv): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("emitMetaMessage")(eventBroadcaster.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def emitSupportCodeMessages(param0: EventBroadcaster): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitSupportCodeMessages")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def orderPickles[T](pickleIds: js.Array[T], order: PickleOrder, logger: ILogger): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("orderPickles")(pickleIds.asInstanceOf[js.Any], order.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseGherkinMessageStream(param0: IParseGherkinMessageStreamRequest): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGherkinMessageStream")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  trait IParseGherkinMessageStreamRequest extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var eventBroadcaster: EventEmitter
    
    var eventDataCollector: EventDataCollector
    
    var gherkinMessageStream: Readable
    
    var order: String
    
    var pickleFilter: default
  }
  object IParseGherkinMessageStreamRequest {
    
    inline def apply(
      eventBroadcaster: EventEmitter,
      eventDataCollector: EventDataCollector,
      gherkinMessageStream: Readable,
      order: String,
      pickleFilter: default
    ): IParseGherkinMessageStreamRequest = {
      val __obj = js.Dynamic.literal(eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], gherkinMessageStream = gherkinMessageStream.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pickleFilter = pickleFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParseGherkinMessageStreamRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParseGherkinMessageStreamRequest] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setEventDataCollector(value: EventDataCollector): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
      
      inline def setGherkinMessageStream(value: Readable): Self = StObject.set(x, "gherkinMessageStream", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setPickleFilter(value: default): Self = StObject.set(x, "pickleFilter", value.asInstanceOf[js.Any])
    }
  }
}
