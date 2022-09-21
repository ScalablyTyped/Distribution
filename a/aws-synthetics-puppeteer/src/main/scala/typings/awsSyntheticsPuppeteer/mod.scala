package typings.awsSyntheticsPuppeteer

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This class handles the creation of broken link checker report.
    * This report can be published and added to Synthetics report.
    */
  @JSImport("BrokenLinkCheckerReport", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BrokenLinkCheckerReport
  
  /**
    * This class handles the creation of broken link checker report.
    * This report can be published and added to Synthetics report.
    */
  @js.native
  trait BrokenLinkCheckerReport extends StObject {
    
    /**
      * Adds a link to BrokenLinkCheckerResult.
      * @param syntheticsLink
      * @param isBrokenLink (optional)- If not passed, defaults to consider link as broken if status code is not available or status code >= 400
      */
    def addLink(syntheticsLink: typings.awsSyntheticsPuppeteer.syntheticsLinkMod.^): Unit = js.native
    def addLink(syntheticsLink: typings.awsSyntheticsPuppeteer.syntheticsLinkMod.^, isBrokenLink: Boolean): Unit = js.native
    
    var brokenLinks: js.Array[String] = js.native
    
    def getLinks(): Record[String, typings.awsSyntheticsPuppeteer.syntheticsLinkMod.^] = js.native
    
    def getTotalBrokenLinks(): Double = js.native
    
    def getTotalLinksChecked(): Double = js.native
    
    var links: Record[String, typings.awsSyntheticsPuppeteer.syntheticsLinkMod.^] = js.native
    
    def reset(): Unit = js.native
    
    var totalBrokenLinks: Double = js.native
    
    var totalLinksChecked: Double = js.native
  }
}
