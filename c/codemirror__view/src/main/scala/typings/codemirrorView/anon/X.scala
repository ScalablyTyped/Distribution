package typings.codemirrorView.anon

import typings.codemirrorView.mod.ScrollStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  /**
    Effect similar to
    [`y`](https://codemirror.net/6/docs/ref/#view.EditorView^scrollIntoView^options.y), but for the
    horizontal scroll position.
    */
  var x: js.UndefOr[ScrollStrategy] = js.undefined
  
  /**
    Extra horizontal distance to add. Not used with the `"center"`
    strategy. Defaults to 5.
    */
  var xMargin: js.UndefOr[Double] = js.undefined
  
  /**
    By default (`"nearest"`) the position will be vertically
    scrolled only the minimal amount required to move the given
    position into view. You can set this to `"start"` to move it
    to the top of the view, `"end"` to move it to the bottom, or
    `"center"` to move it to the center.
    */
  var y: js.UndefOr[ScrollStrategy] = js.undefined
  
  /**
    Extra vertical distance to add when moving something into
    view. Not used with the `"center"` strategy. Defaults to 5.
    */
  var yMargin: js.UndefOr[Double] = js.undefined
}
object X {
  
  inline def apply(): X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setX(value: ScrollStrategy): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
    
    inline def setXMarginUndefined: Self = StObject.set(x, "xMargin", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: ScrollStrategy): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
    
    inline def setYMarginUndefined: Self = StObject.set(x, "yMargin", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
