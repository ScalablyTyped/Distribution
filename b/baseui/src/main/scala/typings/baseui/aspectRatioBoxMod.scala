package typings.baseui

import typings.baseui.blockMod.BlockProps
import typings.react.mod.Component
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioBoxMod {
  
  @JSImport("baseui/aspect-ratio-box", "AspectRatioBox")
  @js.native
  class AspectRatioBox protected ()
    extends Component[AspectRatioBoxProps, js.Object, js.Any] {
    def this(props: AspectRatioBoxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AspectRatioBoxProps, context: js.Any) = this()
  }
  
  @JSImport("baseui/aspect-ratio-box", "AspectRatioBoxBody")
  @js.native
  val AspectRatioBoxBody: FC[BlockProps] = js.native
  
  trait AspectRatioBoxProps
    extends StObject
       with BlockProps {
    
    /** Aspect ratio is width divided by height. */
    var aspectRatio: js.UndefOr[Double] = js.undefined
  }
  object AspectRatioBoxProps {
    
    @scala.inline
    def apply(): AspectRatioBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectRatioBoxProps]
    }
    
    @scala.inline
    implicit class AspectRatioBoxPropsMutableBuilder[Self <: AspectRatioBoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    }
  }
}
