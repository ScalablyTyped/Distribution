package typings.chaiDatetime

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chaiDatetime.mod.global.Chai.Assertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-datetime", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def afterDate(`val`: Date, exp: Date): Unit = js.native
        def afterDate(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def afterTime(`val`: Date, exp: Date): Unit = js.native
        def afterTime(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def beforeDate(`val`: Date, exp: Date): Unit = js.native
        def beforeDate(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def beforeTime(`val`: Date, exp: Date): Unit = js.native
        def beforeTime(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def closeToTime(`val`: Date, exp: Date, deltaInSeconds: Double): Unit = js.native
        def closeToTime(`val`: Date, exp: Date, deltaInSeconds: Double, msg: String): Unit = js.native
        
        def equalDate(`val`: Date, exp: Date): Unit = js.native
        def equalDate(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def equalTime(`val`: Date, exp: Date): Unit = js.native
        def equalTime(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def notAfterDate(`val`: Date, exp: Date): Unit = js.native
        def notAfterDate(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def notAfterTime(`val`: Date, exp: Date): Unit = js.native
        def notAfterTime(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def notBeforeDate(`val`: Date, exp: Date): Unit = js.native
        def notBeforeDate(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def notBeforeTime(`val`: Date, exp: Date): Unit = js.native
        def notBeforeTime(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def notEqualDate(`val`: Date, exp: Date): Unit = js.native
        def notEqualDate(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def notEqualTime(`val`: Date, exp: Date): Unit = js.native
        def notEqualTime(`val`: Date, exp: Date, msg: String): Unit = js.native
        
        def notWithinDate(`val`: Date, expFrom: Date, expTo: Date): Unit = js.native
        def notWithinDate(`val`: Date, expFrom: Date, expTo: Date, msg: String): Unit = js.native
        
        def notWithinTime(`val`: Date, expFrom: Date, expTo: Date): Unit = js.native
        def notWithinTime(`val`: Date, expFrom: Date, expTo: Date, msg: String): Unit = js.native
        
        def withinDate(`val`: Date, expFrom: Date, expTo: Date): Unit = js.native
        def withinDate(`val`: Date, expFrom: Date, expTo: Date, msg: String): Unit = js.native
        
        def withinTime(`val`: Date, expFrom: Date, expTo: Date): Unit = js.native
        def withinTime(`val`: Date, expFrom: Date, expTo: Date, msg: String): Unit = js.native
      }
      
      @js.native
      trait Assertion extends StObject {
        
        def afterDate(date: Date): Assertion = js.native
        
        def afterTime(date: Date): Assertion = js.native
        
        def beforeDate(date: Date): Assertion = js.native
        
        def beforeTime(date: Date): Assertion = js.native
        
        def closeToTime(date: Date, deltaInSeconds: Double): Assertion = js.native
        
        def equalDate(date: Date): Assertion = js.native
        
        def equalTime(date: Date): Assertion = js.native
        
        def withinDate(dateFrom: Date, dateTo: Date): Assertion = js.native
        
        def withinTime(dateFrom: Date, dateTo: Date): Assertion = js.native
      }
      object Assertion {
        
        @scala.inline
        def apply(
          afterDate: Date => Assertion,
          afterTime: Date => Assertion,
          beforeDate: Date => Assertion,
          beforeTime: Date => Assertion,
          closeToTime: (Date, Double) => Assertion,
          equalDate: Date => Assertion,
          equalTime: Date => Assertion,
          withinDate: (Date, Date) => Assertion,
          withinTime: (Date, Date) => Assertion
        ): Assertion = {
          val __obj = js.Dynamic.literal(afterDate = js.Any.fromFunction1(afterDate), afterTime = js.Any.fromFunction1(afterTime), beforeDate = js.Any.fromFunction1(beforeDate), beforeTime = js.Any.fromFunction1(beforeTime), closeToTime = js.Any.fromFunction2(closeToTime), equalDate = js.Any.fromFunction1(equalDate), equalTime = js.Any.fromFunction1(equalTime), withinDate = js.Any.fromFunction2(withinDate), withinTime = js.Any.fromFunction2(withinTime))
          __obj.asInstanceOf[Assertion]
        }
        
        @scala.inline
        implicit class AssertionMutableBuilder[Self <: Assertion] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAfterDate(value: Date => Assertion): Self = StObject.set(x, "afterDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def setAfterTime(value: Date => Assertion): Self = StObject.set(x, "afterTime", js.Any.fromFunction1(value))
          
          @scala.inline
          def setBeforeDate(value: Date => Assertion): Self = StObject.set(x, "beforeDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def setBeforeTime(value: Date => Assertion): Self = StObject.set(x, "beforeTime", js.Any.fromFunction1(value))
          
          @scala.inline
          def setCloseToTime(value: (Date, Double) => Assertion): Self = StObject.set(x, "closeToTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def setEqualDate(value: Date => Assertion): Self = StObject.set(x, "equalDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def setEqualTime(value: Date => Assertion): Self = StObject.set(x, "equalTime", js.Any.fromFunction1(value))
          
          @scala.inline
          def setWithinDate(value: (Date, Date) => Assertion): Self = StObject.set(x, "withinDate", js.Any.fromFunction2(value))
          
          @scala.inline
          def setWithinTime(value: (Date, Date) => Assertion): Self = StObject.set(x, "withinTime", js.Any.fromFunction2(value))
        }
      }
    }
    
    @js.native
    trait Date extends StObject {
      
      var should: Assertion = js.native
    }
    object Date {
      
      @scala.inline
      def apply(should: Assertion): Date = {
        val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
        __obj.asInstanceOf[Date]
      }
      
      @scala.inline
      implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setShould(value: Assertion): Self = StObject.set(x, "should", value.asInstanceOf[js.Any])
      }
    }
  }
}
