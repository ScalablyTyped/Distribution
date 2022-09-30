package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryOutput extends StObject {
  
  /**
    * The repository link's detail data that's returned by Proton.
    */
  var repository: Repository
}
object CreateRepositoryOutput {
  
  inline def apply(repository: Repository): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
  
  extension [Self <: CreateRepositoryOutput](x: Self) {
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
