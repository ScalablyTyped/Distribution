package typings.builderUtilRuntime

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.builderUtilRuntime.builderUtilRuntimeStrings.AES256
import typings.builderUtilRuntime.builderUtilRuntimeStrings.REDUCED_REDUNDANCY
import typings.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD
import typings.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD_IA
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`private`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`public-read`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.alpha
import typings.builderUtilRuntime.builderUtilRuntimeStrings.awsColonkms
import typings.builderUtilRuntime.builderUtilRuntimeStrings.beta
import typings.builderUtilRuntime.builderUtilRuntimeStrings.bitbucket
import typings.builderUtilRuntime.builderUtilRuntimeStrings.custom
import typings.builderUtilRuntime.builderUtilRuntimeStrings.dev
import typings.builderUtilRuntime.builderUtilRuntimeStrings.draft
import typings.builderUtilRuntime.builderUtilRuntimeStrings.generic
import typings.builderUtilRuntime.builderUtilRuntimeStrings.github
import typings.builderUtilRuntime.builderUtilRuntimeStrings.http
import typings.builderUtilRuntime.builderUtilRuntimeStrings.https
import typings.builderUtilRuntime.builderUtilRuntimeStrings.keygen
import typings.builderUtilRuntime.builderUtilRuntimeStrings.prerelease
import typings.builderUtilRuntime.builderUtilRuntimeStrings.rc
import typings.builderUtilRuntime.builderUtilRuntimeStrings.release
import typings.builderUtilRuntime.builderUtilRuntimeStrings.s3
import typings.builderUtilRuntime.builderUtilRuntimeStrings.snapStore
import typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces
import typings.builderUtilRuntime.builderUtilRuntimeStrings.stable
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishOptionsMod {
  
  @JSImport("builder-util-runtime/out/publishOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getS3LikeProviderBaseUrl")(configuration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def githubUrl(options: GithubOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("githubUrl")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def githubUrl(options: GithubOptions, defaultHost: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("githubUrl")(options.asInstanceOf[js.Any], defaultHost.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.builderUtilRuntime.outPublishOptionsMod.GithubOptions
    - typings.builderUtilRuntime.outPublishOptionsMod.S3Options
    - typings.builderUtilRuntime.outPublishOptionsMod.SpacesOptions
    - typings.builderUtilRuntime.outPublishOptionsMod.GenericServerOptions
    - typings.builderUtilRuntime.outPublishOptionsMod.CustomPublishOptions
    - typings.builderUtilRuntime.outPublishOptionsMod.KeygenOptions
    - typings.builderUtilRuntime.outPublishOptionsMod.SnapStoreOptions
    - typings.builderUtilRuntime.outPublishOptionsMod.BitbucketOptions
  */
  type AllPublishOptions = _AllPublishOptions | String
  
  trait BaseS3Options
    extends StObject
       with PublishConfiguration {
    
    /**
      * The ACL. Set to `null` to not [add](https://github.com/electron-userland/electron-builder/issues/1822).
      *
      * @default public-read
      */
    val acl: js.UndefOr[`private` | `public-read` | Null] = js.undefined
    
    /**
      * The update channel.
      * @default latest
      */
    var channel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The directory path.
      * @default /
      */
    val path: js.UndefOr[String | Null] = js.undefined
  }
  object BaseS3Options {
    
    inline def apply(provider: PublishProvider): BaseS3Options = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseS3Options]
    }
    
    extension [Self <: BaseS3Options](x: Self) {
      
      inline def setAcl(value: `private` | `public-read`): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      inline def setAclNull: Self = StObject.set(x, "acl", null)
      
      inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait BitbucketOptions
    extends StObject
       with PublishConfiguration
       with _AllPublishOptions {
    
    /**
      * The channel.
      * @default latest
      */
    val channel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Repository owner
      */
    val owner: String
    
    /**
      * The provider. Must be `bitbucket`.
      */
    @JSName("provider")
    val provider_BitbucketOptions: bitbucket
    
    /**
      * Repository slug/name
      */
    val slug: String
    
    /**
      * The access token to support auto-update from private bitbucket repositories.
      */
    val token: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The user name to support auto-update from private bitbucket repositories.
      */
    val username: js.UndefOr[String | Null] = js.undefined
  }
  object BitbucketOptions {
    
    inline def apply(owner: String, slug: String): BitbucketOptions = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], provider = "bitbucket", slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitbucketOptions]
    }
    
    extension [Self <: BitbucketOptions](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: bitbucket): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenNull: Self = StObject.set(x, "token", null)
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameNull: Self = StObject.set(x, "username", null)
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait CustomPublishOptions
    extends StObject
       with PublishConfiguration
       with /* index */ StringDictionary[Any]
       with _AllPublishOptions {
    
    /**
      * The provider. Must be `custom`.
      */
    @JSName("provider")
    val provider_CustomPublishOptions: custom
    
    /**
      * The Provider to provide UpdateInfo regarding available updates.  Required
      * to use custom providers with electron-updater.
      */
    var updateProvider: js.UndefOr[
        Instantiable3[/* options */ CustomPublishOptions, /* updater */ Any, /* runtimeOptions */ Any, Any]
      ] = js.undefined
  }
  object CustomPublishOptions {
    
    inline def apply(): CustomPublishOptions = {
      val __obj = js.Dynamic.literal(provider = "custom")
      __obj.asInstanceOf[CustomPublishOptions]
    }
    
    extension [Self <: CustomPublishOptions](x: Self) {
      
      inline def setProvider(value: custom): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setUpdateProvider(
        value: Instantiable3[/* options */ CustomPublishOptions, /* updater */ Any, /* runtimeOptions */ Any, Any]
      ): Self = StObject.set(x, "updateProvider", value.asInstanceOf[js.Any])
      
      inline def setUpdateProviderUndefined: Self = StObject.set(x, "updateProvider", js.undefined)
    }
  }
  
  trait GenericServerOptions
    extends StObject
       with PublishConfiguration
       with _AllPublishOptions {
    
    /**
      * The channel.
      * @default latest
      */
    val channel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The provider. Must be `generic`.
      */
    @JSName("provider")
    val provider_GenericServerOptions: generic
    
    /**
      * The base url. e.g. `https://bucket_name.s3.amazonaws.com`.
      */
    val url: String
    
    /**
      * Whether to use multiple range requests for differential update. Defaults to `true` if `url` doesn't contain `s3.amazonaws.com`.
      */
    val useMultipleRangeRequest: js.UndefOr[Boolean] = js.undefined
  }
  object GenericServerOptions {
    
    inline def apply(url: String): GenericServerOptions = {
      val __obj = js.Dynamic.literal(provider = "generic", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericServerOptions]
    }
    
    extension [Self <: GenericServerOptions](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setProvider(value: generic): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUseMultipleRangeRequest(value: Boolean): Self = StObject.set(x, "useMultipleRangeRequest", value.asInstanceOf[js.Any])
      
      inline def setUseMultipleRangeRequestUndefined: Self = StObject.set(x, "useMultipleRangeRequest", js.undefined)
    }
  }
  
  trait GithubOptions
    extends StObject
       with PublishConfiguration
       with _AllPublishOptions {
    
    /**
      * The channel.
      * @default latest
      */
    val channel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The host (including the port if need).
      * @default github.com
      */
    val host: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The owner.
      */
    val owner: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to use private github auto-update provider if `GH_TOKEN` environment variable is defined. See [Private GitHub Update Repo](/auto-update#private-github-update-repo).
      */
    val `private`: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * The protocol. GitHub Publisher supports only `https`.
      * @default https
      */
    val protocol: js.UndefOr[https | http | Null] = js.undefined
    
    /**
      * The provider. Must be `github`.
      */
    @JSName("provider")
    val provider_GithubOptions: github
    
    /**
      * The type of release. By default `draft` release will be created.
      *
      * Also you can set release type using environment variable. If `EP_DRAFT`is set to `true` — `draft`, if `EP_PRE_RELEASE`is set to `true` — `prerelease`.
      * @default draft
      */
    var releaseType: js.UndefOr[draft | prerelease | release | Null] = js.undefined
    
    /**
      * The repository name. [Detected automatically](#github-repository-and-bintray-package).
      */
    val repo: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The access token to support auto-update from private github repositories. Never specify it in the configuration files. Only for [setFeedURL](/auto-update#appupdatersetfeedurloptions).
      */
    val token: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to use `v`-prefixed tag name.
      * @default true
      */
    val vPrefixedTagName: js.UndefOr[Boolean] = js.undefined
  }
  object GithubOptions {
    
    inline def apply(): GithubOptions = {
      val __obj = js.Dynamic.literal(provider = "github")
      __obj.asInstanceOf[GithubOptions]
    }
    
    extension [Self <: GithubOptions](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateNull: Self = StObject.set(x, "private", null)
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setProtocol(value: https | http): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProvider(value: github): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setReleaseType(value: draft | prerelease | release): Self = StObject.set(x, "releaseType", value.asInstanceOf[js.Any])
      
      inline def setReleaseTypeNull: Self = StObject.set(x, "releaseType", null)
      
      inline def setReleaseTypeUndefined: Self = StObject.set(x, "releaseType", js.undefined)
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setRepoNull: Self = StObject.set(x, "repo", null)
      
      inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenNull: Self = StObject.set(x, "token", null)
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setVPrefixedTagName(value: Boolean): Self = StObject.set(x, "vPrefixedTagName", value.asInstanceOf[js.Any])
      
      inline def setVPrefixedTagNameUndefined: Self = StObject.set(x, "vPrefixedTagName", js.undefined)
    }
  }
  
  trait KeygenOptions
    extends StObject
       with PublishConfiguration
       with _AllPublishOptions {
    
    /**
      * Keygen account's UUID
      */
    val account: String
    
    /**
      * The channel.
      * @default stable
      */
    val channel: js.UndefOr[stable | rc | beta | alpha | dev | Null] = js.undefined
    
    /**
      * The target Platform. Is set programmatically explicitly during publishing.
      */
    val platform: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Keygen product's UUID
      */
    val product: String
    
    /**
      * The provider. Must be `keygen`.
      */
    @JSName("provider")
    val provider_KeygenOptions: keygen
  }
  object KeygenOptions {
    
    inline def apply(account: String, product: String): KeygenOptions = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], provider = "keygen")
      __obj.asInstanceOf[KeygenOptions]
    }
    
    extension [Self <: KeygenOptions](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: stable | rc | beta | alpha | dev): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformNull: Self = StObject.set(x, "platform", null)
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: keygen): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishConfiguration extends StObject {
    
    /**
      * The provider.
      */
    val provider: PublishProvider
    
    /**
      * Whether to publish auto update info files.
      *
      * Auto update relies only on the first provider in the list (you can specify several publishers).
      * Thus, probably, there`s no need to upload the metadata files for the other configured providers. But by default will be uploaded.
      *
      * @default true
      */
    val publishAutoUpdate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @private
      * win-only
      */
    var publisherName: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * Any custom request headers
      */
    val requestHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    /**
      * Request timeout in milliseconds. (Default is 2 minutes; O is ignored)
      *
      * @default 60000
      */
    val timeout: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * @private
      * win-only
      */
    val updaterCacheDirName: js.UndefOr[String | Null] = js.undefined
  }
  object PublishConfiguration {
    
    inline def apply(provider: PublishProvider): PublishConfiguration = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishConfiguration]
    }
    
    extension [Self <: PublishConfiguration](x: Self) {
      
      inline def setProvider(value: PublishProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setPublishAutoUpdate(value: Boolean): Self = StObject.set(x, "publishAutoUpdate", value.asInstanceOf[js.Any])
      
      inline def setPublishAutoUpdateUndefined: Self = StObject.set(x, "publishAutoUpdate", js.undefined)
      
      inline def setPublisherName(value: js.Array[String]): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
      
      inline def setPublisherNameNull: Self = StObject.set(x, "publisherName", null)
      
      inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
      
      inline def setPublisherNameVarargs(value: String*): Self = StObject.set(x, "publisherName", js.Array(value*))
      
      inline def setRequestHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUpdaterCacheDirName(value: String): Self = StObject.set(x, "updaterCacheDirName", value.asInstanceOf[js.Any])
      
      inline def setUpdaterCacheDirNameNull: Self = StObject.set(x, "updaterCacheDirName", null)
      
      inline def setUpdaterCacheDirNameUndefined: Self = StObject.set(x, "updaterCacheDirName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.builderUtilRuntime.builderUtilRuntimeStrings.github
    - typings.builderUtilRuntime.builderUtilRuntimeStrings.s3
    - typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces
    - typings.builderUtilRuntime.builderUtilRuntimeStrings.generic
    - typings.builderUtilRuntime.builderUtilRuntimeStrings.custom
    - typings.builderUtilRuntime.builderUtilRuntimeStrings.snapStore
    - typings.builderUtilRuntime.builderUtilRuntimeStrings.keygen
    - typings.builderUtilRuntime.builderUtilRuntimeStrings.bitbucket
  */
  trait PublishProvider extends StObject
  object PublishProvider {
    
    inline def bitbucket: typings.builderUtilRuntime.builderUtilRuntimeStrings.bitbucket = "bitbucket".asInstanceOf[typings.builderUtilRuntime.builderUtilRuntimeStrings.bitbucket]
    
    inline def custom: typings.builderUtilRuntime.builderUtilRuntimeStrings.custom = "custom".asInstanceOf[typings.builderUtilRuntime.builderUtilRuntimeStrings.custom]
    
    inline def generic: typings.builderUtilRuntime.builderUtilRuntimeStrings.generic = "generic".asInstanceOf[typings.builderUtilRuntime.builderUtilRuntimeStrings.generic]
    
    inline def github: typings.builderUtilRuntime.builderUtilRuntimeStrings.github = "github".asInstanceOf[typings.builderUtilRuntime.builderUtilRuntimeStrings.github]
    
    inline def keygen: typings.builderUtilRuntime.builderUtilRuntimeStrings.keygen = "keygen".asInstanceOf[typings.builderUtilRuntime.builderUtilRuntimeStrings.keygen]
    
    inline def s3: typings.builderUtilRuntime.builderUtilRuntimeStrings.s3 = "s3".asInstanceOf[typings.builderUtilRuntime.builderUtilRuntimeStrings.s3]
    
    inline def snapStore: typings.builderUtilRuntime.builderUtilRuntimeStrings.snapStore = "snapStore".asInstanceOf[typings.builderUtilRuntime.builderUtilRuntimeStrings.snapStore]
    
    inline def spaces: typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces = "spaces".asInstanceOf[typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces]
  }
  
  trait S3Options
    extends StObject
       with BaseS3Options
       with _AllPublishOptions {
    
    /**
      * The bucket name.
      */
    val bucket: String
    
    /**
      * Server-side encryption algorithm to use for the object.
      */
    val encryption: js.UndefOr[AES256 | awsColonkms | Null] = js.undefined
    
    /**
      * The endpoint URI to send requests to. The default endpoint is built from the configured region.
      * The endpoint should be a string like `https://{service}.{region}.amazonaws.com`.
      */
    val endpoint: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The provider. Must be `s3`.
      */
    @JSName("provider")
    val provider_S3Options: s3
    
    /**
      * The region. Is determined and set automatically when publishing.
      */
    var region: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The type of storage to use for the object.
      * @default STANDARD
      */
    val storageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | Null] = js.undefined
  }
  object S3Options {
    
    inline def apply(bucket: String): S3Options = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], provider = "s3")
      __obj.asInstanceOf[S3Options]
    }
    
    extension [Self <: S3Options](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: AES256 | awsColonkms): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionNull: Self = StObject.set(x, "encryption", null)
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setProvider(value: s3): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionNull: Self = StObject.set(x, "region", null)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassNull: Self = StObject.set(x, "storageClass", null)
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    }
  }
  
  trait SnapStoreOptions
    extends StObject
       with PublishConfiguration
       with _AllPublishOptions {
    
    /**
      * The list of channels the snap would be released.
      * @default ["edge"]
      */
    val channels: js.UndefOr[String | js.Array[String] | Null] = js.undefined
    
    /**
      * The provider. Must be `snapStore`.
      */
    @JSName("provider")
    val provider_SnapStoreOptions: snapStore
    
    /**
      * snapcraft repo name
      */
    val repo: js.UndefOr[String] = js.undefined
  }
  object SnapStoreOptions {
    
    inline def apply(): SnapStoreOptions = {
      val __obj = js.Dynamic.literal(provider = "snapStore")
      __obj.asInstanceOf[SnapStoreOptions]
    }
    
    extension [Self <: SnapStoreOptions](x: Self) {
      
      inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsNull: Self = StObject.set(x, "channels", null)
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setProvider(value: snapStore): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    }
  }
  
  trait SpacesOptions
    extends StObject
       with BaseS3Options
       with _AllPublishOptions {
    
    /**
      * The space name.
      */
    val name: String
    
    /**
      * The provider. Must be `spaces`.
      */
    @JSName("provider")
    val provider_SpacesOptions: spaces
    
    /**
      * The region (e.g. `nyc3`).
      */
    val region: String
  }
  object SpacesOptions {
    
    inline def apply(name: String, region: String): SpacesOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = "spaces", region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpacesOptions]
    }
    
    extension [Self <: SpacesOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: spaces): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait _AllPublishOptions extends StObject
  object _AllPublishOptions {
    
    inline def BitbucketOptions(owner: String, slug: String): typings.builderUtilRuntime.outPublishOptionsMod.BitbucketOptions = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], provider = "bitbucket", slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.builderUtilRuntime.outPublishOptionsMod.BitbucketOptions]
    }
    
    inline def CustomPublishOptions(): typings.builderUtilRuntime.outPublishOptionsMod.CustomPublishOptions = {
      val __obj = js.Dynamic.literal(provider = "custom")
      __obj.asInstanceOf[typings.builderUtilRuntime.outPublishOptionsMod.CustomPublishOptions]
    }
    
    inline def GenericServerOptions(url: String): typings.builderUtilRuntime.outPublishOptionsMod.GenericServerOptions = {
      val __obj = js.Dynamic.literal(provider = "generic", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.builderUtilRuntime.outPublishOptionsMod.GenericServerOptions]
    }
    
    inline def GithubOptions(): typings.builderUtilRuntime.outPublishOptionsMod.GithubOptions = {
      val __obj = js.Dynamic.literal(provider = "github")
      __obj.asInstanceOf[typings.builderUtilRuntime.outPublishOptionsMod.GithubOptions]
    }
    
    inline def KeygenOptions(account: String, product: String): typings.builderUtilRuntime.outPublishOptionsMod.KeygenOptions = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], provider = "keygen")
      __obj.asInstanceOf[typings.builderUtilRuntime.outPublishOptionsMod.KeygenOptions]
    }
    
    inline def S3Options(bucket: String): typings.builderUtilRuntime.outPublishOptionsMod.S3Options = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], provider = "s3")
      __obj.asInstanceOf[typings.builderUtilRuntime.outPublishOptionsMod.S3Options]
    }
    
    inline def SnapStoreOptions(): typings.builderUtilRuntime.outPublishOptionsMod.SnapStoreOptions = {
      val __obj = js.Dynamic.literal(provider = "snapStore")
      __obj.asInstanceOf[typings.builderUtilRuntime.outPublishOptionsMod.SnapStoreOptions]
    }
    
    inline def SpacesOptions(name: String, region: String): typings.builderUtilRuntime.outPublishOptionsMod.SpacesOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = "spaces", region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.builderUtilRuntime.outPublishOptionsMod.SpacesOptions]
    }
  }
}
