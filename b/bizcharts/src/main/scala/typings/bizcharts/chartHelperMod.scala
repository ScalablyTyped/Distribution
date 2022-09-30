package typings.bizcharts

import org.scalablytyped.runtime.StringDictionary
import typings.bizcharts.anon.Dictx
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartHelperMod {
  
  @JSImport("bizcharts/lib/components/Chart/chartHelper", JSImport.Default)
  @js.native
  open class default () extends ChartHelper
  
  @js.native
  trait ChartHelper
    extends typings.antvEventEmitter.mod.default {
    
    def adapterOptions(hasDataOthers: Dictx): StringDictionary[Any] = js.native
    
    var chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify G2Chart */ Any = js.native
    
    var config: Record[String, Any] = js.native
    
    def createInstance(config: Any): Unit = js.native
    
    def destory(): Unit = js.native
    
    var extendGroup: Any = js.native
    
    /* private */ var isNewInstance: Any = js.native
    
    var key: String = js.native
    
    /* private */ var onGetG2Instance: Any = js.native
    
    def render(): Unit = js.native
    
    def shouldReCreateInstance(newConfig: Any): Boolean = js.native
    
    def update(props: Any): Unit = js.native
  }
}
