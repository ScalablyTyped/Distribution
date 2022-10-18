package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelDataDataLocation extends StObject {
  
  /**
    * The Amazon S3 location of the parallel data input file. The location is returned as a presigned URL to that has a 30-minute expiration.  Amazon Translate doesn't scan all input files for the risk of CSV injection attacks.  CSV injection occurs when a .csv or .tsv file is altered so that a record contains malicious code. The record begins with a special character, such as =, +, -, or @. When the file is opened in a spreadsheet program, the program might interpret the record as a formula and run the code within it. Before you download an input file from Amazon S3, ensure that you recognize the file and trust its creator. 
    */
  var Location: String
  
  /**
    * Describes the repository that contains the parallel data input file.
    */
  var RepositoryType: String
}
object ParallelDataDataLocation {
  
  inline def apply(Location: String, RepositoryType: String): ParallelDataDataLocation = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], RepositoryType = RepositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelDataDataLocation]
  }
  
  extension [Self <: ParallelDataDataLocation](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setRepositoryType(value: String): Self = StObject.set(x, "RepositoryType", value.asInstanceOf[js.Any])
  }
}
