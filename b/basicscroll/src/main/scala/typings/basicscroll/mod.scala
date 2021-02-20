package typings.basicscroll

import org.scalablytyped.runtime.StringDictionary
import typings.basicscroll.anon.From
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("basicscroll", "create")
  @js.native
  def create(opts: Data): BasicScroll = js.native
  
  type AnimatedType = Double | String | Null
  
  @js.native
  trait BasicScroll extends StObject {
    
    /**
      * Converts the start and stop position of the instance to absolute values. basicScroll relies on those values to start and stop the animation at the right position.
      * It runs the calculation once during the instance creation. .calculate() should be called when elements have altered their position or when the size of the site/viewport has changed.
      */
    def calculate(): Unit = js.native
    
    /**
      * Destroys the instance.
      * Should be called when the instance is no longer needed. All props of the instance will keep their last value
      */
    def destroy(): Unit = js.native
    
    /**
      * Returns calculated data.
      * More or less a parsed version of the data used for the instance creation. The data might change when calling the calculate function.
      */
    def getData(): Data = js.native
    
    /**
      * Returns true when the instance is started and false when the instance is stopped.
      */
    def isActive(): Boolean = js.native
    
    /**
      * Starts to animate the instance. basicScroll will track the scroll position and adjust the props of the instance accordingly.
      * An update will be performed only when the scroll position has changed.
      */
    def start(): Unit = js.native
    
    /**
      * Stops to animate the instance. All props of the instance will keep their last value.
      */
    def stop(): Unit = js.native
    
    /**
      * Triggers an update of an instance, even when the instance is currently stopped.
      */
    def update(): Props = js.native
  }
  object BasicScroll {
    
    @scala.inline
    def apply(
      calculate: () => Unit,
      destroy: () => Unit,
      getData: () => Data,
      isActive: () => Boolean,
      start: () => Unit,
      stop: () => Unit,
      update: () => Props
    ): BasicScroll = {
      val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), destroy = js.Any.fromFunction0(destroy), getData = js.Any.fromFunction0(getData), isActive = js.Any.fromFunction0(isActive), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[BasicScroll]
    }
    
    @scala.inline
    implicit class BasicScrollMutableBuilder[Self <: BasicScroll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculate(value: () => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetData(value: () => Data): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Props): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  type CallbackFunction = js.Function3[/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props, Unit]
  
  @js.native
  trait Data extends StObject {
    
    /**
      * Direct mode.
      * @default false
      */
    var direct: js.UndefOr[Boolean | Element] = js.native
    
    /**
      * DOM element/node.
      * @default null
      */
    var elem: js.UndefOr[Element | Null] = js.native
    
    /**
      * Start position.
      * @default null
      */
    var from: AnimatedType = js.native
    
    /**
      * Executes when the user scrolls and the viewport is within the given start and stop position
      */
    var inside: js.UndefOr[CallbackFunction] = js.native
    
    /**
      * Executes when the user scrolls and the viewport is outside the given start and stop position
      */
    var outside: js.UndefOr[CallbackFunction] = js.native
    
    var props: js.UndefOr[Props] = js.native
    
    /**
      * Stop position.
      * @default null
      */
    var to: AnimatedType = js.native
    
    /**
      * Track window size changes.
      * @default true
      */
    var track: js.UndefOr[Boolean] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirect(value: Boolean | Element): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectUndefined: Self = StObject.set(x, "direct", js.undefined)
      
      @scala.inline
      def setElem(value: Element): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElemNull: Self = StObject.set(x, "elem", null)
      
      @scala.inline
      def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
      
      @scala.inline
      def setFrom(value: AnimatedType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromNull: Self = StObject.set(x, "from", null)
      
      @scala.inline
      def setInside(value: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Unit): Self = StObject.set(x, "inside", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
      
      @scala.inline
      def setOutside(value: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Unit): Self = StObject.set(x, "outside", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setTo(value: AnimatedType): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToNull: Self = StObject.set(x, "to", null)
      
      @scala.inline
      def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.basicscroll.basicscrollStrings.backInOut
    - typings.basicscroll.basicscrollStrings.backIn
    - typings.basicscroll.basicscrollStrings.backOut
    - typings.basicscroll.basicscrollStrings.bounceInOut
    - typings.basicscroll.basicscrollStrings.bounceIn
    - typings.basicscroll.basicscrollStrings.bounceOut
    - typings.basicscroll.basicscrollStrings.circInOut
    - typings.basicscroll.basicscrollStrings.circIn
    - typings.basicscroll.basicscrollStrings.circOut
    - typings.basicscroll.basicscrollStrings.cubicInOut
    - typings.basicscroll.basicscrollStrings.cubicIn
    - typings.basicscroll.basicscrollStrings.cubicOut
    - typings.basicscroll.basicscrollStrings.elasticInOut
    - typings.basicscroll.basicscrollStrings.elasticIn
    - typings.basicscroll.basicscrollStrings.elasticOut
    - typings.basicscroll.basicscrollStrings.expoInOut
    - typings.basicscroll.basicscrollStrings.expoIn
    - typings.basicscroll.basicscrollStrings.expoOut
    - typings.basicscroll.basicscrollStrings.linear
    - typings.basicscroll.basicscrollStrings.quadInOut
    - typings.basicscroll.basicscrollStrings.quadIn
    - typings.basicscroll.basicscrollStrings.quadOut
    - typings.basicscroll.basicscrollStrings.quartInOut
    - typings.basicscroll.basicscrollStrings.quartIn
    - typings.basicscroll.basicscrollStrings.quartOut
    - typings.basicscroll.basicscrollStrings.quintInOut
    - typings.basicscroll.basicscrollStrings.quintIn
    - typings.basicscroll.basicscrollStrings.quintOut
    - typings.basicscroll.basicscrollStrings.sineInOut
    - typings.basicscroll.basicscrollStrings.sineIn
    - typings.basicscroll.basicscrollStrings.sineOut
  */
  trait KnownTimings extends StObject
  object KnownTimings {
    
    @scala.inline
    def backIn: typings.basicscroll.basicscrollStrings.backIn = "backIn".asInstanceOf[typings.basicscroll.basicscrollStrings.backIn]
    
    @scala.inline
    def backInOut: typings.basicscroll.basicscrollStrings.backInOut = "backInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.backInOut]
    
    @scala.inline
    def backOut: typings.basicscroll.basicscrollStrings.backOut = "backOut".asInstanceOf[typings.basicscroll.basicscrollStrings.backOut]
    
    @scala.inline
    def bounceIn: typings.basicscroll.basicscrollStrings.bounceIn = "bounceIn".asInstanceOf[typings.basicscroll.basicscrollStrings.bounceIn]
    
    @scala.inline
    def bounceInOut: typings.basicscroll.basicscrollStrings.bounceInOut = "bounceInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.bounceInOut]
    
    @scala.inline
    def bounceOut: typings.basicscroll.basicscrollStrings.bounceOut = "bounceOut".asInstanceOf[typings.basicscroll.basicscrollStrings.bounceOut]
    
    @scala.inline
    def circIn: typings.basicscroll.basicscrollStrings.circIn = "circIn".asInstanceOf[typings.basicscroll.basicscrollStrings.circIn]
    
    @scala.inline
    def circInOut: typings.basicscroll.basicscrollStrings.circInOut = "circInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.circInOut]
    
    @scala.inline
    def circOut: typings.basicscroll.basicscrollStrings.circOut = "circOut".asInstanceOf[typings.basicscroll.basicscrollStrings.circOut]
    
    @scala.inline
    def cubicIn: typings.basicscroll.basicscrollStrings.cubicIn = "cubicIn".asInstanceOf[typings.basicscroll.basicscrollStrings.cubicIn]
    
    @scala.inline
    def cubicInOut: typings.basicscroll.basicscrollStrings.cubicInOut = "cubicInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.cubicInOut]
    
    @scala.inline
    def cubicOut: typings.basicscroll.basicscrollStrings.cubicOut = "cubicOut".asInstanceOf[typings.basicscroll.basicscrollStrings.cubicOut]
    
    @scala.inline
    def elasticIn: typings.basicscroll.basicscrollStrings.elasticIn = "elasticIn".asInstanceOf[typings.basicscroll.basicscrollStrings.elasticIn]
    
    @scala.inline
    def elasticInOut: typings.basicscroll.basicscrollStrings.elasticInOut = "elasticInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.elasticInOut]
    
    @scala.inline
    def elasticOut: typings.basicscroll.basicscrollStrings.elasticOut = "elasticOut".asInstanceOf[typings.basicscroll.basicscrollStrings.elasticOut]
    
    @scala.inline
    def expoIn: typings.basicscroll.basicscrollStrings.expoIn = "expoIn".asInstanceOf[typings.basicscroll.basicscrollStrings.expoIn]
    
    @scala.inline
    def expoInOut: typings.basicscroll.basicscrollStrings.expoInOut = "expoInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.expoInOut]
    
    @scala.inline
    def expoOut: typings.basicscroll.basicscrollStrings.expoOut = "expoOut".asInstanceOf[typings.basicscroll.basicscrollStrings.expoOut]
    
    @scala.inline
    def linear: typings.basicscroll.basicscrollStrings.linear = "linear".asInstanceOf[typings.basicscroll.basicscrollStrings.linear]
    
    @scala.inline
    def quadIn: typings.basicscroll.basicscrollStrings.quadIn = "quadIn".asInstanceOf[typings.basicscroll.basicscrollStrings.quadIn]
    
    @scala.inline
    def quadInOut: typings.basicscroll.basicscrollStrings.quadInOut = "quadInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.quadInOut]
    
    @scala.inline
    def quadOut: typings.basicscroll.basicscrollStrings.quadOut = "quadOut".asInstanceOf[typings.basicscroll.basicscrollStrings.quadOut]
    
    @scala.inline
    def quartIn: typings.basicscroll.basicscrollStrings.quartIn = "quartIn".asInstanceOf[typings.basicscroll.basicscrollStrings.quartIn]
    
    @scala.inline
    def quartInOut: typings.basicscroll.basicscrollStrings.quartInOut = "quartInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.quartInOut]
    
    @scala.inline
    def quartOut: typings.basicscroll.basicscrollStrings.quartOut = "quartOut".asInstanceOf[typings.basicscroll.basicscrollStrings.quartOut]
    
    @scala.inline
    def quintIn: typings.basicscroll.basicscrollStrings.quintIn = "quintIn".asInstanceOf[typings.basicscroll.basicscrollStrings.quintIn]
    
    @scala.inline
    def quintInOut: typings.basicscroll.basicscrollStrings.quintInOut = "quintInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.quintInOut]
    
    @scala.inline
    def quintOut: typings.basicscroll.basicscrollStrings.quintOut = "quintOut".asInstanceOf[typings.basicscroll.basicscrollStrings.quintOut]
    
    @scala.inline
    def sineIn: typings.basicscroll.basicscrollStrings.sineIn = "sineIn".asInstanceOf[typings.basicscroll.basicscrollStrings.sineIn]
    
    @scala.inline
    def sineInOut: typings.basicscroll.basicscrollStrings.sineInOut = "sineInOut".asInstanceOf[typings.basicscroll.basicscrollStrings.sineInOut]
    
    @scala.inline
    def sineOut: typings.basicscroll.basicscrollStrings.sineOut = "sineOut".asInstanceOf[typings.basicscroll.basicscrollStrings.sineOut]
  }
  
  type Props = StringDictionary[From]
  
  type TimingFunction = js.Function1[/* t */ Double, Double]
}
