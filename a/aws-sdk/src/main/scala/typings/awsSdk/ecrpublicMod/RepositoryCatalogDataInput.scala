package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryCatalogDataInput extends StObject {
  
  /**
    * A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public Gallery. The text must be in markdown format.
    */
  var aboutText: js.UndefOr[AboutText] = js.undefined
  
  /**
    * The system architecture that the images in the repository are compatible with. On the Amazon ECR Public Gallery, the following supported architectures will appear as badges on the repository and are used as search filters.    Linux     Windows     If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery. 
    */
  var architectures: js.UndefOr[ArchitectureList] = js.undefined
  
  /**
    * A short description of the contents of the repository. This text appears in both the image details and also when searching for repositories on the Amazon ECR Public Gallery.
    */
  var description: js.UndefOr[RepositoryDescription] = js.undefined
  
  /**
    * The base64-encoded repository logo payload.  The repository logo is only publicly visible in the Amazon ECR Public Gallery for verified accounts. 
    */
  var logoImageBlob: js.UndefOr[LogoImageBlob] = js.undefined
  
  /**
    * The operating systems that the images in the repository are compatible with. On the Amazon ECR Public Gallery, the following supported operating systems will appear as badges on the repository and are used as search filters.    ARM     ARM 64     x86     x86-64     If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery. 
    */
  var operatingSystems: js.UndefOr[OperatingSystemList] = js.undefined
  
  /**
    * Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon ECR Public Gallery. The usage text provides context, support information, and additional usage details for users of the repository. The text must be in markdown format.
    */
  var usageText: js.UndefOr[UsageText] = js.undefined
}
object RepositoryCatalogDataInput {
  
  inline def apply(): RepositoryCatalogDataInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryCatalogDataInput]
  }
  
  extension [Self <: RepositoryCatalogDataInput](x: Self) {
    
    inline def setAboutText(value: AboutText): Self = StObject.set(x, "aboutText", value.asInstanceOf[js.Any])
    
    inline def setAboutTextUndefined: Self = StObject.set(x, "aboutText", js.undefined)
    
    inline def setArchitectures(value: ArchitectureList): Self = StObject.set(x, "architectures", value.asInstanceOf[js.Any])
    
    inline def setArchitecturesUndefined: Self = StObject.set(x, "architectures", js.undefined)
    
    inline def setArchitecturesVarargs(value: Architecture*): Self = StObject.set(x, "architectures", js.Array(value*))
    
    inline def setDescription(value: RepositoryDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLogoImageBlob(value: LogoImageBlob): Self = StObject.set(x, "logoImageBlob", value.asInstanceOf[js.Any])
    
    inline def setLogoImageBlobUndefined: Self = StObject.set(x, "logoImageBlob", js.undefined)
    
    inline def setOperatingSystems(value: OperatingSystemList): Self = StObject.set(x, "operatingSystems", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemsUndefined: Self = StObject.set(x, "operatingSystems", js.undefined)
    
    inline def setOperatingSystemsVarargs(value: OperatingSystem*): Self = StObject.set(x, "operatingSystems", js.Array(value*))
    
    inline def setUsageText(value: UsageText): Self = StObject.set(x, "usageText", value.asInstanceOf[js.Any])
    
    inline def setUsageTextUndefined: Self = StObject.set(x, "usageText", js.undefined)
  }
}
