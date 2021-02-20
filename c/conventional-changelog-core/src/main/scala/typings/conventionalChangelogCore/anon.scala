package typings.conventionalChangelogCore

import org.scalablytyped.runtime.StringDictionary
import typings.normalizePackageData.anon.Email
import typings.normalizePackageData.anon.Type
import typings.normalizePackageData.anon.Url
import typings.normalizePackageData.mod.Person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Partial<normalize-package-data.normalize-package-data.Package>> */
  @js.native
  trait ReadonlyPartialPackage extends StObject {
    
    val _id: js.UndefOr[String] = js.native
    
    val author: js.UndefOr[Person] = js.native
    
    val bin: js.UndefOr[StringDictionary[String]] = js.native
    
    val bugs: js.UndefOr[Email | Url] = js.native
    
    val bundleDependencies: js.UndefOr[StringDictionary[String]] = js.native
    
    val contributors: js.UndefOr[js.Array[Person]] = js.native
    
    val dependencies: js.UndefOr[StringDictionary[String]] = js.native
    
    val description: js.UndefOr[String] = js.native
    
    val devDependencies: js.UndefOr[StringDictionary[String]] = js.native
    
    val engines: js.UndefOr[StringDictionary[String]] = js.native
    
    val files: js.UndefOr[js.Array[String]] = js.native
    
    val homepage: js.UndefOr[String] = js.native
    
    val keywords: js.UndefOr[js.Array[String]] = js.native
    
    val license: js.UndefOr[String] = js.native
    
    val maintainers: js.UndefOr[js.Array[Person]] = js.native
    
    val man: js.UndefOr[js.Array[String]] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    val optionalDependencies: js.UndefOr[StringDictionary[String]] = js.native
    
    val readme: js.UndefOr[String] = js.native
    
    val repository: js.UndefOr[Type] = js.native
    
    val scripts: js.UndefOr[StringDictionary[String]] = js.native
    
    val version: js.UndefOr[String] = js.native
  }
  object ReadonlyPartialPackage {
    
    @scala.inline
    def apply(): ReadonlyPartialPackage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialPackage]
    }
    
    @scala.inline
    implicit class ReadonlyPartialPackageMutableBuilder[Self <: ReadonlyPartialPackage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setBin(value: StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      @scala.inline
      def setBugs(value: Email | Url): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      @scala.inline
      def setBundleDependencies(value: StringDictionary[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      @scala.inline
      def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      @scala.inline
      def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value :_*))
      
      @scala.inline
      def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setEngines(value: StringDictionary[String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      @scala.inline
      def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      @scala.inline
      def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      @scala.inline
      def setMan(value: js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      @scala.inline
      def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionalDependencies(value: StringDictionary[String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      @scala.inline
      def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      @scala.inline
      def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setScripts(value: StringDictionary[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    }
  }
}
