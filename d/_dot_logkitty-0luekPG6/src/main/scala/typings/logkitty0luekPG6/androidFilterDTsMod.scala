package typings.logkitty0luekPG6

import typings.logkitty0luekPG6.typesDTsMod.Entry
import typings.logkitty0luekPG6.typesDTsMod.IFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidFilterDTsMod {
  
  @JSImport(".logkitty-0luekPG6/build/android/AndroidFilter.d.ts", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AndroidFilter {
    def this(minPriority: Double) = this()
    
    /* CompleteClass */
    override def shouldInclude(entry: Entry): Boolean = js.native
  }
  
  @js.native
  trait AndroidFilter
    extends StObject
       with IFilter {
    
    /* private */ var filter: Any = js.native
    
    /* private */ val minPriority: Any = js.native
    
    def setCustomFilter(patterns: js.Array[String]): Unit = js.native
    
    def setFilterByApp(applicationId: String): Unit = js.native
    def setFilterByApp(applicationId: String, adbPath: String): Unit = js.native
    
    def setFilterByMatch(regexes: js.Array[js.RegExp]): Unit = js.native
    
    def setFilterByTag(tags: js.Array[String]): Unit = js.native
  }
}
