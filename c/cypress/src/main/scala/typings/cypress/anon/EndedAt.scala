package typings.cypress.anon

import typings.cypress.CypressCommandLine.dateTimeISO
import typings.cypress.CypressCommandLine.ms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndedAt extends StObject {
  
  var duration: ms
  
  var endedAt: dateTimeISO
  
  var failures: Double
  
  var passes: Double
  
  var pending: Double
  
  var skipped: Double
  
  var startedAt: dateTimeISO
  
  var suites: Double
  
  var tests: Double
  
  var wallClockDuration: js.UndefOr[Double] = js.undefined
}
object EndedAt {
  
  inline def apply(
    duration: ms,
    endedAt: dateTimeISO,
    failures: Double,
    passes: Double,
    pending: Double,
    skipped: Double,
    startedAt: dateTimeISO,
    suites: Double,
    tests: Double
  ): EndedAt = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], endedAt = endedAt.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndedAt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndedAt] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: ms): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEndedAt(value: dateTimeISO): Self = StObject.set(x, "endedAt", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: dateTimeISO): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setSuites(value: Double): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
    
    inline def setTests(value: Double): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setWallClockDuration(value: Double): Self = StObject.set(x, "wallClockDuration", value.asInstanceOf[js.Any])
    
    inline def setWallClockDurationUndefined: Self = StObject.set(x, "wallClockDuration", js.undefined)
  }
}
