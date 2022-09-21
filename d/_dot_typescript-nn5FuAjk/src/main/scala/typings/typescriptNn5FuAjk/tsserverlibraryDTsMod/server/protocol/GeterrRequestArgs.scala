package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for geterr messages.
  */
trait GeterrRequestArgs extends StObject {
  
  /**
    * Delay in milliseconds to wait before starting to compute
    * errors for the files in the file list
    */
  var delay: Double
  
  /**
    * List of file names for which to compute compiler errors.
    * The files will be checked in list order.
    */
  var files: Array[String]
}
object GeterrRequestArgs {
  
  inline def apply(delay: Double, files: Array[String]): GeterrRequestArgs = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeterrRequestArgs]
  }
  
  extension [Self <: GeterrRequestArgs](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
  }
}
