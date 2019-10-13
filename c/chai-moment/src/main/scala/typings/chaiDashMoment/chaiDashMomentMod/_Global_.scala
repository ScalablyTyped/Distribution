package typings.chaiDashMoment.chaiDashMomentMod

import typings.chaiDashMoment.chaiDashMomentMod._Global_.ChaiMoment.Granularity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  object Chai extends js.Object {
    @js.native
    trait AssertStatic extends js.Object {
      def afterMoment(`val`: js.Any, exp: js.Any): Unit = js.native
      def afterMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
      def afterMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
      def afterMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
      def beforeMoment(`val`: js.Any, exp: js.Any): Unit = js.native
      def beforeMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
      def beforeMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
      def beforeMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
      def sameMoment(`val`: js.Any, exp: js.Any): Unit = js.native
      def sameMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
      def sameMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
      def sameMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
    }
    
    @js.native
    trait Assertion extends js.Object {
      def afterMoment(expected: js.Any): Unit = js.native
      def afterMoment(expected: js.Any, granularity: Granularity): Unit = js.native
      def beforeMoment(expected: js.Any): Unit = js.native
      def beforeMoment(expected: js.Any, granularity: Granularity): Unit = js.native
      def sameMoment(expected: js.Any): Unit = js.native
      def sameMoment(expected: js.Any, granularity: Granularity): Unit = js.native
    }
    
  }
  
  @js.native
  object ChaiMoment extends js.Object {
    /* Rewritten from type alias, can be one of: 
      - typings.chaiDashMoment.chaiDashMomentStrings.year
      - typings.chaiDashMoment.chaiDashMomentStrings.month
      - typings.chaiDashMoment.chaiDashMomentStrings.week
      - typings.chaiDashMoment.chaiDashMomentStrings.day
      - typings.chaiDashMoment.chaiDashMomentStrings.hour
      - typings.chaiDashMoment.chaiDashMomentStrings.minute
      - typings.chaiDashMoment.chaiDashMomentStrings.second
    */
    trait Granularity extends js.Object
    
  }
  
}

