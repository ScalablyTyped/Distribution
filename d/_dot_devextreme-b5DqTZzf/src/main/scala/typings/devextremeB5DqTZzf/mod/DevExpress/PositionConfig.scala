package typings.devextremeB5DqTZzf.mod.DevExpress

import typings.devextremeB5DqTZzf.anon.X
import typings.devextremeB5DqTZzf.anon.XY
import typings.devextremeB5DqTZzf.anon.Y
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`fit flip`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`fit flipfit`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`fit none`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`flip fit`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`flip none`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`flipfit fit`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`flipfit none`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`left bottom`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`left top`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`none fit`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`none flip`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`none flipfit`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`right bottom`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`right top`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.fit
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.flip
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.flipfit
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionConfig extends StObject {
  
  /**
    * Specifies the target element&apos;s side or corner where the overlay element should be positioned.
    */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.undefined
  
  /**
    * A boundary element in which the overlay element must be positioned.
    */
  var boundary: js.UndefOr[String | UserDefinedElement[Element] | Window] = js.undefined
  
  /**
    * Specifies the offset of boundaries from the boundary element.
    */
  var boundaryOffset: js.UndefOr[String | Y] = js.undefined
  
  /**
    * Specifies how to resolve collisions - when the overlay element exceeds the boundary element.
    */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
  ] = js.undefined
  
  /**
    * Specifies the overlay element&apos;s side or corner to align with a target element.
    */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.undefined
  
  /**
    * The target element relative to which the overlay element should be positioned.
    */
  var of: js.UndefOr[String | UserDefinedElement[Element] | Window] = js.undefined
  
  /**
    * Specifies the overlay element&apos;s offset from a specified position.
    */
  var offset: js.UndefOr[String | Y] = js.undefined
}
object PositionConfig {
  
  inline def apply(): PositionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionConfig]
  }
  
  extension [Self <: PositionConfig](x: Self) {
    
    inline def setAt(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
    ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setBoundary(value: String | UserDefinedElement[Element] | Window): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryOffset(value: String | Y): Self = StObject.set(x, "boundaryOffset", value.asInstanceOf[js.Any])
    
    inline def setBoundaryOffsetUndefined: Self = StObject.set(x, "boundaryOffset", js.undefined)
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setCollision(
      value: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
    ): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    inline def setMy(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
    ): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    inline def setOf(value: String | UserDefinedElement[Element] | Window): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    inline def setOffset(value: String | Y): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
