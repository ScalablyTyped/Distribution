package typings.cometd

import typings.cometd.mod.CometD
import typings.cometd.mod.Extension
import typings.cometd.mod.Listener
import typings.cometd.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeSyncExtensionMod {
  
  @JSImport("cometd/TimeSyncExtension", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TimeSyncExtension {
    
    /**
      * Get the estimated network lag in ms from the client to the server.
      */
    /* CompleteClass */
    override def getNetworkLag(): Double = js.native
    
    /**
      *
      * Get the estimated server time as a Date object
      */
    /* CompleteClass */
    override def getServerDate(): js.Date = js.native
    
    /**
      * Get the estimated server time in ms since the epoch.
      */
    /* CompleteClass */
    override def getServerTime(): Double = js.native
    
    /**
      * Get the estimated offset in ms from the clients clock to the
      * servers clock.  The server time is the client time plus the offset.
      */
    /* CompleteClass */
    override def getTimeOffset(): Double = js.native
    
    /**
      * Get an array of multiple offset samples used to calculate
      * the offset.
      */
    /* CompleteClass */
    override def getTimeOffsetSamples(): js.Array[Double] = js.native
    
    /* CompleteClass */
    @JSName("incoming")
    override def incoming_MTimeSyncExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("outgoing")
    override def outgoing_MTimeSyncExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("registered")
    override def registered_MTimeSyncExtension(name: String, cometd: CometD): Unit = js.native
    
    /* CompleteClass */
    @JSName("unregistered")
    override def unregistered_MTimeSyncExtension(): Unit = js.native
  }
  
  trait TimeSyncExtension
    extends StObject
       with Extension {
    
    /**
      * Get the estimated network lag in ms from the client to the server.
      */
    def getNetworkLag(): Double
    
    /**
      *
      * Get the estimated server time as a Date object
      */
    def getServerDate(): js.Date
    
    /**
      * Get the estimated server time in ms since the epoch.
      */
    def getServerTime(): Double
    
    /**
      * Get the estimated offset in ms from the clients clock to the
      * servers clock.  The server time is the client time plus the offset.
      */
    def getTimeOffset(): Double
    
    /**
      * Get an array of multiple offset samples used to calculate
      * the offset.
      */
    def getTimeOffsetSamples(): js.Array[Double]
    
    @JSName("incoming")
    def incoming_MTimeSyncExtension(message: Message): Unit
    @JSName("incoming")
    var incoming_Original: Listener
    
    @JSName("outgoing")
    def outgoing_MTimeSyncExtension(message: Message): Unit
    @JSName("outgoing")
    var outgoing_Original: Listener
    
    @JSName("registered")
    def registered_MTimeSyncExtension(name: String, cometd: CometD): Unit
    
    @JSName("unregistered")
    def unregistered_MTimeSyncExtension(): Unit
  }
  object TimeSyncExtension {
    
    inline def apply(
      getNetworkLag: () => Double,
      getServerDate: () => js.Date,
      getServerTime: () => Double,
      getTimeOffset: () => Double,
      getTimeOffsetSamples: () => js.Array[Double],
      incoming: /* message */ Message => Unit,
      outgoing: /* message */ Message => Unit,
      registered: (String, CometD) => Unit,
      unregistered: () => Unit
    ): TimeSyncExtension = {
      val __obj = js.Dynamic.literal(getNetworkLag = js.Any.fromFunction0(getNetworkLag), getServerDate = js.Any.fromFunction0(getServerDate), getServerTime = js.Any.fromFunction0(getServerTime), getTimeOffset = js.Any.fromFunction0(getTimeOffset), getTimeOffsetSamples = js.Any.fromFunction0(getTimeOffsetSamples), incoming = js.Any.fromFunction1(incoming), outgoing = js.Any.fromFunction1(outgoing), registered = js.Any.fromFunction2(registered), unregistered = js.Any.fromFunction0(unregistered))
      __obj.asInstanceOf[TimeSyncExtension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeSyncExtension] (val x: Self) extends AnyVal {
      
      inline def setGetNetworkLag(value: () => Double): Self = StObject.set(x, "getNetworkLag", js.Any.fromFunction0(value))
      
      inline def setGetServerDate(value: () => js.Date): Self = StObject.set(x, "getServerDate", js.Any.fromFunction0(value))
      
      inline def setGetServerTime(value: () => Double): Self = StObject.set(x, "getServerTime", js.Any.fromFunction0(value))
      
      inline def setGetTimeOffset(value: () => Double): Self = StObject.set(x, "getTimeOffset", js.Any.fromFunction0(value))
      
      inline def setGetTimeOffsetSamples(value: () => js.Array[Double]): Self = StObject.set(x, "getTimeOffsetSamples", js.Any.fromFunction0(value))
      
      inline def setIncoming(value: /* message */ Message => Unit): Self = StObject.set(x, "incoming", js.Any.fromFunction1(value))
      
      inline def setOutgoing(value: /* message */ Message => Unit): Self = StObject.set(x, "outgoing", js.Any.fromFunction1(value))
      
      inline def setRegistered(value: (String, CometD) => Unit): Self = StObject.set(x, "registered", js.Any.fromFunction2(value))
      
      inline def setUnregistered(value: () => Unit): Self = StObject.set(x, "unregistered", js.Any.fromFunction0(value))
    }
  }
}
