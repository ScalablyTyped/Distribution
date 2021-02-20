package typings.babylonjs

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathColorMod.Color4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradientsMod {
  
  @JSImport("babylonjs/Misc/gradients", "Color3Gradient")
  @js.native
  class Color3Gradient protected () extends IValueGradient {
    /**
      * Creates a new color3 gradient
      * @param gradient gets or sets the gradient value (between 0 and 1)
      * @param color gets or sets associated color
      */
    def this(
      /**
      * Gets or sets the gradient value (between 0 and 1)
      */
    gradient: Double,
      /**
      * Gets or sets the associated color
      */
    color: Color3
    ) = this()
    
    /**
      * Gets or sets the associated color
      */
    var color: Color3 = js.native
  }
  
  @JSImport("babylonjs/Misc/gradients", "ColorGradient")
  @js.native
  class ColorGradient protected () extends IValueGradient {
    /**
      * Creates a new color4 gradient
      * @param gradient gets or sets the gradient value (between 0 and 1)
      * @param color1 gets or sets first associated color
      * @param color2 gets or sets first second color
      */
    def this(
      /**
      * Gets or sets the gradient value (between 0 and 1)
      */
    gradient: Double,
      /**
      * Gets or sets first associated color
      */
    color1: Color4
    ) = this()
    def this(
      /**
      * Gets or sets the gradient value (between 0 and 1)
      */
    gradient: Double,
      /**
      * Gets or sets first associated color
      */
    color1: Color4,
      /**
      * Gets or sets second associated color
      */
    color2: Color4
    ) = this()
    
    /**
      * Gets or sets first associated color
      */
    var color1: Color4 = js.native
    
    /**
      * Gets or sets second associated color
      */
    var color2: js.UndefOr[Color4] = js.native
    
    /**
      * Will get a color picked randomly between color1 and color2.
      * If color2 is undefined then color1 will be used
      * @param result defines the target Color4 to store the result in
      */
    def getColorToRef(result: Color4): Unit = js.native
  }
  
  @JSImport("babylonjs/Misc/gradients", "FactorGradient")
  @js.native
  class FactorGradient protected () extends IValueGradient {
    /**
      * Creates a new factor gradient
      * @param gradient gets or sets the gradient value (between 0 and 1)
      * @param factor1 gets or sets first associated factor
      * @param factor2 gets or sets second associated factor
      */
    def this(
      /**
      * Gets or sets the gradient value (between 0 and 1)
      */
    gradient: Double,
      /**
      * Gets or sets first associated factor
      */
    factor1: Double
    ) = this()
    def this(
      /**
      * Gets or sets the gradient value (between 0 and 1)
      */
    gradient: Double,
      /**
      * Gets or sets first associated factor
      */
    factor1: Double,
      /**
      * Gets or sets second associated factor
      */
    factor2: Double
    ) = this()
    
    /**
      * Gets or sets first associated factor
      */
    var factor1: Double = js.native
    
    /**
      * Gets or sets second associated factor
      */
    var factor2: js.UndefOr[Double] = js.native
    
    /**
      * Will get a number picked randomly between factor1 and factor2.
      * If factor2 is undefined then factor1 will be used
      * @returns the picked number
      */
    def getFactor(): Double = js.native
  }
  
  @JSImport("babylonjs/Misc/gradients", "GradientHelper")
  @js.native
  class GradientHelper () extends StObject
  /* static members */
  object GradientHelper {
    
    /**
      * Gets the current gradient from an array of IValueGradient
      * @param ratio defines the current ratio to get
      * @param gradients defines the array of IValueGradient
      * @param updateFunc defines the callback function used to get the final value from the selected gradients
      */
    @JSImport("babylonjs/Misc/gradients", "GradientHelper.GetCurrentGradient")
    @js.native
    def GetCurrentGradient(
      ratio: Double,
      gradients: js.Array[IValueGradient],
      updateFunc: js.Function3[/* current */ IValueGradient, /* next */ IValueGradient, /* scale */ Double, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait IValueGradient extends StObject {
    
    /**
      * Gets or sets the gradient value (between 0 and 1)
      */
    var gradient: Double = js.native
  }
  object IValueGradient {
    
    @scala.inline
    def apply(gradient: Double): IValueGradient = {
      val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValueGradient]
    }
    
    @scala.inline
    implicit class IValueGradientMutableBuilder[Self <: IValueGradient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGradient(value: Double): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    }
  }
}
