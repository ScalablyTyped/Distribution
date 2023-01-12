package typings.cookieclicker.Game

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buff
  extends StObject
     with BuffParameter {
  
  var arg1: js.UndefOr[Double] = js.undefined
  
  var arg2: js.UndefOr[Double] = js.undefined
  
  var arg3: js.UndefOr[Double] = js.undefined
  
  @JSName("desc")
  var desc_Buff: String
  
  @JSName("dname")
  var dname_Buff: String
  
  @JSName("icon")
  var icon_Buff: Icon
  
  var l: HTMLDivElement
  
  /**
    * The total length of the buff in frames
    */
  var maxTime: Double
  
  @JSName("name")
  var name_Buff: String
  
  @JSName("time")
  var time_Buff: Double
  
  var `type`: buffType
}
object Buff {
  
  inline def apply(
    desc: String,
    dname: String,
    icon: Icon,
    l: HTMLDivElement,
    maxTime: Double,
    name: String,
    time: Double,
    `type`: buffType
  ): Buff = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], dname = dname.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], maxTime = maxTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buff]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buff] (val x: Self) extends AnyVal {
    
    inline def setArg1(value: Double): Self = StObject.set(x, "arg1", value.asInstanceOf[js.Any])
    
    inline def setArg1Undefined: Self = StObject.set(x, "arg1", js.undefined)
    
    inline def setArg2(value: Double): Self = StObject.set(x, "arg2", value.asInstanceOf[js.Any])
    
    inline def setArg2Undefined: Self = StObject.set(x, "arg2", js.undefined)
    
    inline def setArg3(value: Double): Self = StObject.set(x, "arg3", value.asInstanceOf[js.Any])
    
    inline def setArg3Undefined: Self = StObject.set(x, "arg3", js.undefined)
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDname(value: String): Self = StObject.set(x, "dname", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setL(value: HTMLDivElement): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setType(value: buffType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
