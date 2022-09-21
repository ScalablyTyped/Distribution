package typings.devextremeB5DqTZzf.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animation {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.devextremeB5DqTZzf.anon.Opacity
    - typings.devextremeB5DqTZzf.anon.Scale
    - typings.devextremeB5DqTZzf.anon.Position
    - typings.devextremeB5DqTZzf.anon.Left
    - typings.devextremeB5DqTZzf.anon.Top
  */
  type AnimationState = _AnimationState | String | Double
  
  trait _AnimationState extends StObject
  object _AnimationState {
    
    inline def Left(left: Double): typings.devextremeB5DqTZzf.anon.Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextremeB5DqTZzf.anon.Left]
    }
    
    inline def Opacity(opacity: Double): typings.devextremeB5DqTZzf.anon.Opacity = {
      val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextremeB5DqTZzf.anon.Opacity]
    }
    
    inline def Position(position: PositionConfig): typings.devextremeB5DqTZzf.anon.Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextremeB5DqTZzf.anon.Position]
    }
    
    inline def Scale(scale: Double): typings.devextremeB5DqTZzf.anon.Scale = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextremeB5DqTZzf.anon.Scale]
    }
    
    inline def Top(top: Double): typings.devextremeB5DqTZzf.anon.Top = {
      val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextremeB5DqTZzf.anon.Top]
    }
  }
  
  type animationConfig = AnimationConfig
  
  type positionConfig = PositionConfig
}
