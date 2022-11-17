package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Date adapter (current used by the time scale)
  * @namespace Chart._adapters._date
  * @memberof Chart._adapters
  * @private
  */
@js.native
trait DateAdapterBase
  extends StObject
     with DateAdapter[AnyObject] {
  
  def add(): Double = js.native
  
  def diff(): Double = js.native
  
  def endOf(): Double = js.native
  
  def format(): String = js.native
  
  def init(): Unit = js.native
  
  def parse(): Double | Null = js.native
  
  def startOf(): Double = js.native
}
