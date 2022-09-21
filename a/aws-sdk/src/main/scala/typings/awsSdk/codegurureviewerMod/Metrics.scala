package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  /**
    * Total number of recommendations found in the code review.
    */
  var FindingsCount: js.UndefOr[typings.awsSdk.codegurureviewerMod.FindingsCount] = js.undefined
  
  /**
    *  MeteredLinesOfCodeCount is the number of lines of code in the repository where the code review happened. This does not include non-code lines such as comments and blank lines.
    */
  var MeteredLinesOfCodeCount: js.UndefOr[LinesOfCodeCount] = js.undefined
  
  /**
    *  SuppressedLinesOfCodeCount is the number of lines of code in the repository where the code review happened that CodeGuru Reviewer did not analyze. The lines suppressed in the analysis is based on the excludeFiles variable in the aws-codeguru-reviewer.yml file. This number does not include non-code lines such as comments and blank lines. 
    */
  var SuppressedLinesOfCodeCount: js.UndefOr[LinesOfCodeCount] = js.undefined
}
object Metrics {
  
  inline def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  
  extension [Self <: Metrics](x: Self) {
    
    inline def setFindingsCount(value: FindingsCount): Self = StObject.set(x, "FindingsCount", value.asInstanceOf[js.Any])
    
    inline def setFindingsCountUndefined: Self = StObject.set(x, "FindingsCount", js.undefined)
    
    inline def setMeteredLinesOfCodeCount(value: LinesOfCodeCount): Self = StObject.set(x, "MeteredLinesOfCodeCount", value.asInstanceOf[js.Any])
    
    inline def setMeteredLinesOfCodeCountUndefined: Self = StObject.set(x, "MeteredLinesOfCodeCount", js.undefined)
    
    inline def setSuppressedLinesOfCodeCount(value: LinesOfCodeCount): Self = StObject.set(x, "SuppressedLinesOfCodeCount", value.asInstanceOf[js.Any])
    
    inline def setSuppressedLinesOfCodeCountUndefined: Self = StObject.set(x, "SuppressedLinesOfCodeCount", js.undefined)
  }
}
