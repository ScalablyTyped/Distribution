package typings.cronConverter

import typings.luxon.mod.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsScheduleMod {
  
  @JSImport("cron-converter/dist/mjs/schedule", "Schedule")
  @js.native
  open class Schedule protected () extends StObject {
    /**
      * Default constructor
      *
      * @param arr The cron schedule as an array
      * @param now An optional reference date
      * @param timezone An optional timezone string
      */
    def this(arr: js.Array[js.Array[Double]]) = this()
    def this(arr: js.Array[js.Array[Double]], now: String) = this()
    def this(arr: js.Array[js.Array[Double]], now: js.Date) = this()
    def this(arr: js.Array[js.Array[Double]], now: String, timezone: String) = this()
    def this(arr: js.Array[js.Array[Double]], now: js.Date, timezone: String) = this()
    def this(arr: js.Array[js.Array[Double]], now: Unit, timezone: String) = this()
    
    val arr: js.Array[js.Array[Double]] = js.native
    
    var date: DateTime = js.native
    
    /**
      * Returns the time the schedule would run next
      *
      * @return The time the schedule would run next
      */
    def next(): DateTime = js.native
    
    val now: DateTime = js.native
    
    /**
      * Returns the time the schedule would have last run at
      *
      * @return The time the schedule would have last run at
      */
    def prev(): DateTime = js.native
    
    var pristine: Boolean = js.native
    
    /**
      * Resets the iterator
      */
    def reset(): Unit = js.native
  }
}
