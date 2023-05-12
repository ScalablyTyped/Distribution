package typings.dcpClient

import typings.dcpClient.dcpClientStrings.accepted
import typings.dcpClient.dcpClientStrings.cancel
import typings.dcpClient.dcpClientStrings.complete
import typings.dcpClient.dcpClientStrings.console
import typings.dcpClient.dcpClientStrings.debug
import typings.dcpClient.dcpClientStrings.error
import typings.dcpClient.dcpClientStrings.info
import typings.dcpClient.dcpClientStrings.log
import typings.dcpClient.dcpClientStrings.main
import typings.dcpClient.dcpClientStrings.readystatechange
import typings.dcpClient.dcpClientStrings.result
import typings.dcpClient.dcpClientStrings.resultsUpdated
import typings.dcpClient.dcpClientStrings.sliceEnd
import typings.dcpClient.dcpClientStrings.sliceError
import typings.dcpClient.dcpClientStrings.sliceFinish
import typings.dcpClient.dcpClientStrings.sliceStart
import typings.dcpClient.dcpClientStrings.status
import typings.dcpClient.dcpClientStrings.terminate
import typings.dcpClient.dcpClientStrings.warn
import typings.dcpClient.mod.ResultHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    /**
      * The address (id) of the the job.
      */
    var address: typings.dcpClient.mod.Address
    
    var result: Request
    
    /**
      * The index of the slice.
      */
    var sort: Double
    
    /**
      * The address of the task (slice) that the result came from.
      */
    var task: typings.dcpClient.mod.Address
  }
  object Address {
    
    inline def apply(
      address: typings.dcpClient.mod.Address,
      result: Request,
      sort: Double,
      task: typings.dcpClient.mod.Address
    ): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: typings.dcpClient.mod.Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Request): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSort(value: Double): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setTask(value: typings.dcpClient.mod.Address): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    }
  }
  
  trait Distributed extends StObject {
    
    /**
      * The address (id) of the job.
      */
    var address: typings.dcpClient.mod.Address
    
    /**
      * Number of slices that have been distributed.
      */
    var distributed: Double
    
    /**
      * The job's run status before any updates from a status event.
      */
    var runStatus: String
    
    /**
      * Total number of slices.
      */
    var total: Double
  }
  object Distributed {
    
    inline def apply(address: typings.dcpClient.mod.Address, distributed: Double, runStatus: String, total: Double): Distributed = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], distributed = distributed.asInstanceOf[js.Any], runStatus = runStatus.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Distributed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Distributed] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: typings.dcpClient.mod.Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setDistributed(value: Double): Self = StObject.set(x, "distributed", value.asInstanceOf[js.Any])
      
      inline def setRunStatus(value: String): Self = StObject.set(x, "runStatus", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(event: sliceError | sliceEnd | terminate, listener: js.Function0[Unit]): Unit = js.native
    def apply(event: sliceFinish, listener: js.Function1[/* result */ Any, Unit]): Unit = js.native
    def apply(event: sliceStart, listener: js.Function1[/* job */ js.Object, Unit]): Unit = js.native
  }
  
  @js.native
  trait FnCallEventNameListener extends StObject {
    
    def apply(eventName: readystatechange | resultsUpdated | cancel, listener: js.Function0[Unit]): Unit = js.native
    def apply(eventName: accepted, listener: js.Function1[/* event */ Job, Unit]): Unit = js.native
    def apply(eventName: complete, listener: js.Function1[/* event */ ResultHandle, Unit]): Unit = js.native
    def apply(eventName: console, listener: js.Function1[/* event */ Level, Unit]): Unit = js.native
    def apply(eventName: error, listener: js.Function1[/* event */ Message, Unit]): Unit = js.native
    def apply(eventName: result, listener: js.Function1[/* event */ Address, Unit]): Unit = js.native
    def apply(eventName: status, listener: js.Function1[/* event */ Distributed, Unit]): Unit = js.native
  }
  
  trait Job extends StObject {
    
    var job: this.type
  }
  object Job {
    
    inline def apply(job: Job): Job = {
      val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
      
      inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    /**
      * The address (id) of the job.
      */
    var address: typings.dcpClient.mod.Address
    
    /**
      * The log level.
      */
    var level: debug | info | log | warn | error
    
    /**
      * The console message.
      */
    var message: String
    
    /**
      * The index of the slice that threw the error.
      */
    var sliceIndex: Double
  }
  object Level {
    
    inline def apply(
      address: typings.dcpClient.mod.Address,
      level: debug | info | log | warn | error,
      message: String,
      sliceIndex: Double
    ): Level = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sliceIndex = sliceIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: typings.dcpClient.mod.Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: debug | info | log | warn | error): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSliceIndex(value: Double): Self = StObject.set(x, "sliceIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    /**
      * The address (id) of the job.
      */
    var address: typings.dcpClient.mod.Address
    
    /**
      * The error message.
      */
    var message: String
    
    /**
      * The error's name.
      */
    var name: String
    
    /**
      * The index of the slice that threw the error.
      */
    var sliceIndex: Double
    
    /**
      * The error's stack trace.
      */
    var stack: String
  }
  object Message {
    
    inline def apply(
      address: typings.dcpClient.mod.Address,
      message: String,
      name: String,
      sliceIndex: Double,
      stack: String
    ): Message = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sliceIndex = sliceIndex.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: typings.dcpClient.mod.Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSliceIndex(value: Double): Self = StObject.set(x, "sliceIndex", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var request: main
    
    /**
      * The value returned.
      */
    var result: Any
  }
  object Request {
    
    inline def apply(result: Any): Request = {
      val __obj = js.Dynamic.literal(request = "main", result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: main): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
