package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for navto request message.
  */
trait NavtoRequestArgs extends StObject {
  
  /**
    * Optional flag to indicate we want results for just the current file
    * or the entire project.
    */
  var currentFileOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file for the request (absolute pathname required).
    */
  var file: js.UndefOr[String] = js.undefined
  
  /**
    *  Optional limit on the number of items to return.
    */
  var maxResultCount: js.UndefOr[Double] = js.undefined
  
  var projectFileName: js.UndefOr[String] = js.undefined
  
  /**
    * Search term to navigate to from current location; term can
    * be '.*' or an identifier prefix.
    */
  var searchValue: String
}
object NavtoRequestArgs {
  
  inline def apply(searchValue: String): NavtoRequestArgs = {
    val __obj = js.Dynamic.literal(searchValue = searchValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavtoRequestArgs]
  }
  
  extension [Self <: NavtoRequestArgs](x: Self) {
    
    inline def setCurrentFileOnly(value: Boolean): Self = StObject.set(x, "currentFileOnly", value.asInstanceOf[js.Any])
    
    inline def setCurrentFileOnlyUndefined: Self = StObject.set(x, "currentFileOnly", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setMaxResultCount(value: Double): Self = StObject.set(x, "maxResultCount", value.asInstanceOf[js.Any])
    
    inline def setMaxResultCountUndefined: Self = StObject.set(x, "maxResultCount", js.undefined)
    
    inline def setProjectFileName(value: String): Self = StObject.set(x, "projectFileName", value.asInstanceOf[js.Any])
    
    inline def setProjectFileNameUndefined: Self = StObject.set(x, "projectFileName", js.undefined)
    
    inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
  }
}
