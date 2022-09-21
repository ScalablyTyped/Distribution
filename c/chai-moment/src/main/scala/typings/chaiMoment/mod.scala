package typings.chaiMoment

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chaiMoment.mod.global.ChaiMoment.Granularity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-moment", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait AssertStatic extends StObject {
        
        def afterMoment(`val`: Any, exp: Any): Unit = js.native
        def afterMoment(`val`: Any, exp: Any, granularity: Granularity): Unit = js.native
        def afterMoment(`val`: Any, exp: Any, granularity: Granularity, msg: String): Unit = js.native
        def afterMoment(`val`: Any, exp: Any, msg: String): Unit = js.native
        
        def beforeMoment(`val`: Any, exp: Any): Unit = js.native
        def beforeMoment(`val`: Any, exp: Any, granularity: Unit, msg: String): Unit = js.native
        def beforeMoment(`val`: Any, exp: Any, granularity: Granularity): Unit = js.native
        def beforeMoment(`val`: Any, exp: Any, granularity: Granularity, msg: String): Unit = js.native
        def beforeMoment(`val`: Any, exp: Any, msg: String): Unit = js.native
        
        def sameMoment(`val`: Any, exp: Any): Unit = js.native
        def sameMoment(`val`: Any, exp: Any, granularity: Unit, msg: String): Unit = js.native
        def sameMoment(`val`: Any, exp: Any, granularity: Granularity): Unit = js.native
        def sameMoment(`val`: Any, exp: Any, granularity: Granularity, msg: String): Unit = js.native
        def sameMoment(`val`: Any, exp: Any, msg: String): Unit = js.native
      }
      
      @js.native
      trait Assertion extends StObject {
        
        def afterMoment(expected: Any): Unit = js.native
        def afterMoment(expected: Any, granularity: Granularity): Unit = js.native
        
        def beforeMoment(expected: Any): Unit = js.native
        def beforeMoment(expected: Any, granularity: Granularity): Unit = js.native
        
        def sameMoment(expected: Any): Unit = js.native
        def sameMoment(expected: Any, granularity: Granularity): Unit = js.native
      }
    }
    
    object ChaiMoment {
      
      /* Rewritten from type alias, can be one of: 
        - typings.chaiMoment.chaiMomentStrings.year
        - typings.chaiMoment.chaiMomentStrings.month
        - typings.chaiMoment.chaiMomentStrings.week
        - typings.chaiMoment.chaiMomentStrings.day
        - typings.chaiMoment.chaiMomentStrings.hour
        - typings.chaiMoment.chaiMomentStrings.minute
        - typings.chaiMoment.chaiMomentStrings.second
      */
      trait Granularity extends StObject
      object Granularity {
        
        inline def day: typings.chaiMoment.chaiMomentStrings.day = "day".asInstanceOf[typings.chaiMoment.chaiMomentStrings.day]
        
        inline def hour: typings.chaiMoment.chaiMomentStrings.hour = "hour".asInstanceOf[typings.chaiMoment.chaiMomentStrings.hour]
        
        inline def minute: typings.chaiMoment.chaiMomentStrings.minute = "minute".asInstanceOf[typings.chaiMoment.chaiMomentStrings.minute]
        
        inline def month: typings.chaiMoment.chaiMomentStrings.month = "month".asInstanceOf[typings.chaiMoment.chaiMomentStrings.month]
        
        inline def second: typings.chaiMoment.chaiMomentStrings.second = "second".asInstanceOf[typings.chaiMoment.chaiMomentStrings.second]
        
        inline def week: typings.chaiMoment.chaiMomentStrings.week = "week".asInstanceOf[typings.chaiMoment.chaiMomentStrings.week]
        
        inline def year: typings.chaiMoment.chaiMomentStrings.year = "year".asInstanceOf[typings.chaiMoment.chaiMomentStrings.year]
      }
    }
  }
}
