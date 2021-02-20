package typings.chaiMoment

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chaiMoment.mod.global.ChaiMoment.Granularity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
        
        def afterMoment(`val`: js.Any, exp: js.Any): Unit = js.native
        def afterMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
        def afterMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
        def afterMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
        
        def beforeMoment(`val`: js.Any, exp: js.Any): Unit = js.native
        def beforeMoment(`val`: js.Any, exp: js.Any, granularity: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
        def beforeMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
        def beforeMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
        def beforeMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
        
        def sameMoment(`val`: js.Any, exp: js.Any): Unit = js.native
        def sameMoment(`val`: js.Any, exp: js.Any, granularity: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
        def sameMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
        def sameMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
        def sameMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
      }
      
      @js.native
      trait Assertion extends StObject {
        
        def afterMoment(expected: js.Any): Unit = js.native
        def afterMoment(expected: js.Any, granularity: Granularity): Unit = js.native
        
        def beforeMoment(expected: js.Any): Unit = js.native
        def beforeMoment(expected: js.Any, granularity: Granularity): Unit = js.native
        
        def sameMoment(expected: js.Any): Unit = js.native
        def sameMoment(expected: js.Any, granularity: Granularity): Unit = js.native
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
        
        @scala.inline
        def day: typings.chaiMoment.chaiMomentStrings.day = "day".asInstanceOf[typings.chaiMoment.chaiMomentStrings.day]
        
        @scala.inline
        def hour: typings.chaiMoment.chaiMomentStrings.hour = "hour".asInstanceOf[typings.chaiMoment.chaiMomentStrings.hour]
        
        @scala.inline
        def minute: typings.chaiMoment.chaiMomentStrings.minute = "minute".asInstanceOf[typings.chaiMoment.chaiMomentStrings.minute]
        
        @scala.inline
        def month: typings.chaiMoment.chaiMomentStrings.month = "month".asInstanceOf[typings.chaiMoment.chaiMomentStrings.month]
        
        @scala.inline
        def second: typings.chaiMoment.chaiMomentStrings.second = "second".asInstanceOf[typings.chaiMoment.chaiMomentStrings.second]
        
        @scala.inline
        def week: typings.chaiMoment.chaiMomentStrings.week = "week".asInstanceOf[typings.chaiMoment.chaiMomentStrings.week]
        
        @scala.inline
        def year: typings.chaiMoment.chaiMomentStrings.year = "year".asInstanceOf[typings.chaiMoment.chaiMomentStrings.year]
      }
    }
  }
}
