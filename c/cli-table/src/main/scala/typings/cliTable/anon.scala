package typings.cliTable

import typings.cliTable.cliTableStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Border extends StObject {
    
    var border: js.UndefOr[js.Array[String]] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var head: js.UndefOr[js.Array[String]] = js.undefined
    
    var `padding-left`: js.UndefOr[Double] = js.undefined
    
    var `padding-right`: js.UndefOr[Double] = js.undefined
  }
  object Border {
    
    inline def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    extension [Self <: Border](x: Self) {
      
      inline def setBorder(value: js.Array[String]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: String*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def `setPadding-left`(value: Double): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
      
      inline def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
      
      inline def `setPadding-right`(value: Double): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
      
      inline def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    }
  }
  
  trait Head extends StObject {
    
    var head: Array[_empty | String]
  }
  object Head {
    
    inline def apply(head: Array[_empty | String]): Head = {
      val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Head]
    }
    
    extension [Self <: Head](x: Self) {
      
      inline def setHead(value: Array[_empty | String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ k in 'top' | 'top-mid' | 'top-left' | 'top-right' | 'bottom' | 'bottom-mid' | 'bottom-left' | 'bottom-right' | 'left' | 'left-mid' | 'mid' | 'mid-mid' | 'right' | 'right-mid' | 'middle' ]:? string} */
  trait kintoptopmidtoplefttoprig extends StObject {
    
    var bottom: js.UndefOr[String] = js.undefined
    
    var `bottom-left`: js.UndefOr[String] = js.undefined
    
    var `bottom-mid`: js.UndefOr[String] = js.undefined
    
    var `bottom-right`: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[String] = js.undefined
    
    var `left-mid`: js.UndefOr[String] = js.undefined
    
    var mid: js.UndefOr[String] = js.undefined
    
    var `mid-mid`: js.UndefOr[String] = js.undefined
    
    var middle: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[String] = js.undefined
    
    var `right-mid`: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
    
    var `top-left`: js.UndefOr[String] = js.undefined
    
    var `top-mid`: js.UndefOr[String] = js.undefined
    
    var `top-right`: js.UndefOr[String] = js.undefined
  }
  object kintoptopmidtoplefttoprig {
    
    inline def apply(): kintoptopmidtoplefttoprig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[kintoptopmidtoplefttoprig]
    }
    
    extension [Self <: kintoptopmidtoplefttoprig](x: Self) {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def `setBottom-left`(value: String): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
      
      inline def `setBottom-leftUndefined`: Self = StObject.set(x, "bottom-left", js.undefined)
      
      inline def `setBottom-mid`(value: String): Self = StObject.set(x, "bottom-mid", value.asInstanceOf[js.Any])
      
      inline def `setBottom-midUndefined`: Self = StObject.set(x, "bottom-mid", js.undefined)
      
      inline def `setBottom-right`(value: String): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
      
      inline def `setBottom-rightUndefined`: Self = StObject.set(x, "bottom-right", js.undefined)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def `setLeft-mid`(value: String): Self = StObject.set(x, "left-mid", value.asInstanceOf[js.Any])
      
      inline def `setLeft-midUndefined`: Self = StObject.set(x, "left-mid", js.undefined)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
      
      inline def `setMid-mid`(value: String): Self = StObject.set(x, "mid-mid", value.asInstanceOf[js.Any])
      
      inline def `setMid-midUndefined`: Self = StObject.set(x, "mid-mid", js.undefined)
      
      inline def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
      
      inline def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def `setRight-mid`(value: String): Self = StObject.set(x, "right-mid", value.asInstanceOf[js.Any])
      
      inline def `setRight-midUndefined`: Self = StObject.set(x, "right-mid", js.undefined)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def `setTop-left`(value: String): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
      
      inline def `setTop-leftUndefined`: Self = StObject.set(x, "top-left", js.undefined)
      
      inline def `setTop-mid`(value: String): Self = StObject.set(x, "top-mid", value.asInstanceOf[js.Any])
      
      inline def `setTop-midUndefined`: Self = StObject.set(x, "top-mid", js.undefined)
      
      inline def `setTop-right`(value: String): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
      
      inline def `setTop-rightUndefined`: Self = StObject.set(x, "top-right", js.undefined)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
