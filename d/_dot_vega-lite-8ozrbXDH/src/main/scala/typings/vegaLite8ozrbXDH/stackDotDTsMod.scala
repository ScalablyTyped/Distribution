package typings.vegaLite8ozrbXDH

import typings.std.Set
import typings.vegaLite8ozrbXDH.anon.ChannelFieldDef
import typings.vegaLite8ozrbXDH.anon.DisallowNonLinearStack
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.arc
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.area
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.bar
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.circle
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.geoshape
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.image
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.line
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.radius
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rect
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rule
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.square
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.text
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.theta
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.tick
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.trail
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.xOffset
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.y
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.yOffset
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/stack.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/stack.d.ts", "STACKABLE_MARKS")
  @js.native
  val STACKABLE_MARKS: Set[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick
  ] = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/stack.d.ts", "STACK_BY_DEFAULT_MARKS")
  @js.native
  val STACK_BY_DEFAULT_MARKS: Set[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick
  ] = js.native
  
  inline def isStackOffset(s: String): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/stack.d.ts.StackOffset */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStackOffset")(s.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/stack.d.ts.StackOffset */ Boolean]
  
  inline def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String]): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  inline def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String], opt: DisallowNonLinearStack): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  inline def stack(m: Mark, encoding: Encoding[String]): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  inline def stack(m: Mark, encoding: Encoding[String], opt: DisallowNonLinearStack): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  
  /* keyof .vega-lite-8ozrbXDH.anon.Center */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.zero
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.center
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.normalize
  */
  trait StackOffset extends StObject
  
  trait StackProperties extends StObject {
    
    /** Measure axis of the stack. */
    var fieldChannel: x | y | theta | radius
    
    /** Dimension axis of the stack. */
    var groupbyChannels: js.Array[x | y | theta | radius | xOffset | yOffset]
    
    /** Field for groupbyChannel. */
    var groupbyFields: Set[FieldName]
    
    /**
      * Whether this stack will produce impute transform
      */
    var impute: Boolean
    
    /**
      * See `stack` property of Position Field Def.
      */
    var offset: StackOffset
    
    /** Stack-by fields e.g., color, detail */
    var stackBy: js.Array[ChannelFieldDef]
  }
  object StackProperties {
    
    inline def apply(
      fieldChannel: x | y | theta | radius,
      groupbyChannels: js.Array[x | y | theta | radius | xOffset | yOffset],
      groupbyFields: Set[FieldName],
      impute: Boolean,
      offset: StackOffset,
      stackBy: js.Array[ChannelFieldDef]
    ): StackProperties = {
      val __obj = js.Dynamic.literal(fieldChannel = fieldChannel.asInstanceOf[js.Any], groupbyChannels = groupbyChannels.asInstanceOf[js.Any], groupbyFields = groupbyFields.asInstanceOf[js.Any], impute = impute.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stackBy = stackBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackProperties]
    }
    
    extension [Self <: StackProperties](x: Self) {
      
      inline def setFieldChannel(value: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x | y | theta | radius): Self = StObject.set(x, "fieldChannel", value.asInstanceOf[js.Any])
      
      inline def setGroupbyChannels(
        value: js.Array[
              typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x | y | theta | radius | xOffset | yOffset
            ]
      ): Self = StObject.set(x, "groupbyChannels", value.asInstanceOf[js.Any])
      
      inline def setGroupbyChannelsVarargs(
        value: (typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x | y | theta | radius | xOffset | yOffset)*
      ): Self = StObject.set(x, "groupbyChannels", js.Array(value*))
      
      inline def setGroupbyFields(value: Set[FieldName]): Self = StObject.set(x, "groupbyFields", value.asInstanceOf[js.Any])
      
      inline def setImpute(value: Boolean): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: StackOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStackBy(value: js.Array[ChannelFieldDef]): Self = StObject.set(x, "stackBy", value.asInstanceOf[js.Any])
      
      inline def setStackByVarargs(value: ChannelFieldDef*): Self = StObject.set(x, "stackBy", js.Array(value*))
    }
  }
}
