package typings.awsSdk.servicecatalogMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceCatalog extends Service {
  
  /**
    * Accepts an offer to share the specified portfolio.
    */
  def acceptPortfolioShare(): Request[AcceptPortfolioShareOutput, AWSError] = js.native
  def acceptPortfolioShare(callback: js.Function2[/* err */ AWSError, /* data */ AcceptPortfolioShareOutput, Unit]): Request[AcceptPortfolioShareOutput, AWSError] = js.native
  /**
    * Accepts an offer to share the specified portfolio.
    */
  def acceptPortfolioShare(params: AcceptPortfolioShareInput): Request[AcceptPortfolioShareOutput, AWSError] = js.native
  def acceptPortfolioShare(
    params: AcceptPortfolioShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptPortfolioShareOutput, Unit]
  ): Request[AcceptPortfolioShareOutput, AWSError] = js.native
  
  /**
    * Associates the specified budget with the specified resource.
    */
  def associateBudgetWithResource(): Request[AssociateBudgetWithResourceOutput, AWSError] = js.native
  def associateBudgetWithResource(callback: js.Function2[/* err */ AWSError, /* data */ AssociateBudgetWithResourceOutput, Unit]): Request[AssociateBudgetWithResourceOutput, AWSError] = js.native
  /**
    * Associates the specified budget with the specified resource.
    */
  def associateBudgetWithResource(params: AssociateBudgetWithResourceInput): Request[AssociateBudgetWithResourceOutput, AWSError] = js.native
  def associateBudgetWithResource(
    params: AssociateBudgetWithResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateBudgetWithResourceOutput, Unit]
  ): Request[AssociateBudgetWithResourceOutput, AWSError] = js.native
  
  /**
    * Associates the specified principal ARN with the specified portfolio.
    */
  def associatePrincipalWithPortfolio(): Request[AssociatePrincipalWithPortfolioOutput, AWSError] = js.native
  def associatePrincipalWithPortfolio(callback: js.Function2[/* err */ AWSError, /* data */ AssociatePrincipalWithPortfolioOutput, Unit]): Request[AssociatePrincipalWithPortfolioOutput, AWSError] = js.native
  /**
    * Associates the specified principal ARN with the specified portfolio.
    */
  def associatePrincipalWithPortfolio(params: AssociatePrincipalWithPortfolioInput): Request[AssociatePrincipalWithPortfolioOutput, AWSError] = js.native
  def associatePrincipalWithPortfolio(
    params: AssociatePrincipalWithPortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePrincipalWithPortfolioOutput, Unit]
  ): Request[AssociatePrincipalWithPortfolioOutput, AWSError] = js.native
  
  /**
    * Associates the specified product with the specified portfolio. A delegated admin is authorized to invoke this command.
    */
  def associateProductWithPortfolio(): Request[AssociateProductWithPortfolioOutput, AWSError] = js.native
  def associateProductWithPortfolio(callback: js.Function2[/* err */ AWSError, /* data */ AssociateProductWithPortfolioOutput, Unit]): Request[AssociateProductWithPortfolioOutput, AWSError] = js.native
  /**
    * Associates the specified product with the specified portfolio. A delegated admin is authorized to invoke this command.
    */
  def associateProductWithPortfolio(params: AssociateProductWithPortfolioInput): Request[AssociateProductWithPortfolioOutput, AWSError] = js.native
  def associateProductWithPortfolio(
    params: AssociateProductWithPortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateProductWithPortfolioOutput, Unit]
  ): Request[AssociateProductWithPortfolioOutput, AWSError] = js.native
  
  /**
    * Associates a self-service action with a provisioning artifact.
    */
  def associateServiceActionWithProvisioningArtifact(): Request[AssociateServiceActionWithProvisioningArtifactOutput, AWSError] = js.native
  def associateServiceActionWithProvisioningArtifact(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateServiceActionWithProvisioningArtifactOutput, 
      Unit
    ]
  ): Request[AssociateServiceActionWithProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Associates a self-service action with a provisioning artifact.
    */
  def associateServiceActionWithProvisioningArtifact(params: AssociateServiceActionWithProvisioningArtifactInput): Request[AssociateServiceActionWithProvisioningArtifactOutput, AWSError] = js.native
  def associateServiceActionWithProvisioningArtifact(
    params: AssociateServiceActionWithProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateServiceActionWithProvisioningArtifactOutput, 
      Unit
    ]
  ): Request[AssociateServiceActionWithProvisioningArtifactOutput, AWSError] = js.native
  
  /**
    * Associate the specified TagOption with the specified portfolio or product.
    */
  def associateTagOptionWithResource(): Request[AssociateTagOptionWithResourceOutput, AWSError] = js.native
  def associateTagOptionWithResource(callback: js.Function2[/* err */ AWSError, /* data */ AssociateTagOptionWithResourceOutput, Unit]): Request[AssociateTagOptionWithResourceOutput, AWSError] = js.native
  /**
    * Associate the specified TagOption with the specified portfolio or product.
    */
  def associateTagOptionWithResource(params: AssociateTagOptionWithResourceInput): Request[AssociateTagOptionWithResourceOutput, AWSError] = js.native
  def associateTagOptionWithResource(
    params: AssociateTagOptionWithResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTagOptionWithResourceOutput, Unit]
  ): Request[AssociateTagOptionWithResourceOutput, AWSError] = js.native
  
  /**
    * Associates multiple self-service actions with provisioning artifacts.
    */
  def batchAssociateServiceActionWithProvisioningArtifact(): Request[BatchAssociateServiceActionWithProvisioningArtifactOutput, AWSError] = js.native
  def batchAssociateServiceActionWithProvisioningArtifact(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchAssociateServiceActionWithProvisioningArtifactOutput, 
      Unit
    ]
  ): Request[BatchAssociateServiceActionWithProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Associates multiple self-service actions with provisioning artifacts.
    */
  def batchAssociateServiceActionWithProvisioningArtifact(params: BatchAssociateServiceActionWithProvisioningArtifactInput): Request[BatchAssociateServiceActionWithProvisioningArtifactOutput, AWSError] = js.native
  def batchAssociateServiceActionWithProvisioningArtifact(
    params: BatchAssociateServiceActionWithProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchAssociateServiceActionWithProvisioningArtifactOutput, 
      Unit
    ]
  ): Request[BatchAssociateServiceActionWithProvisioningArtifactOutput, AWSError] = js.native
  
  /**
    * Disassociates a batch of self-service actions from the specified provisioning artifact.
    */
  def batchDisassociateServiceActionFromProvisioningArtifact(): Request[BatchDisassociateServiceActionFromProvisioningArtifactOutput, AWSError] = js.native
  def batchDisassociateServiceActionFromProvisioningArtifact(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
      Unit
    ]
  ): Request[BatchDisassociateServiceActionFromProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Disassociates a batch of self-service actions from the specified provisioning artifact.
    */
  def batchDisassociateServiceActionFromProvisioningArtifact(params: BatchDisassociateServiceActionFromProvisioningArtifactInput): Request[BatchDisassociateServiceActionFromProvisioningArtifactOutput, AWSError] = js.native
  def batchDisassociateServiceActionFromProvisioningArtifact(
    params: BatchDisassociateServiceActionFromProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
      Unit
    ]
  ): Request[BatchDisassociateServiceActionFromProvisioningArtifactOutput, AWSError] = js.native
  
  @JSName("config")
  var config_ServiceCatalog: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
    */
  def copyProduct(): Request[CopyProductOutput, AWSError] = js.native
  def copyProduct(callback: js.Function2[/* err */ AWSError, /* data */ CopyProductOutput, Unit]): Request[CopyProductOutput, AWSError] = js.native
  /**
    * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
    */
  def copyProduct(params: CopyProductInput): Request[CopyProductOutput, AWSError] = js.native
  def copyProduct(
    params: CopyProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyProductOutput, Unit]
  ): Request[CopyProductOutput, AWSError] = js.native
  
  /**
    * Creates a constraint. A delegated admin is authorized to invoke this command.
    */
  def createConstraint(): Request[CreateConstraintOutput, AWSError] = js.native
  def createConstraint(callback: js.Function2[/* err */ AWSError, /* data */ CreateConstraintOutput, Unit]): Request[CreateConstraintOutput, AWSError] = js.native
  /**
    * Creates a constraint. A delegated admin is authorized to invoke this command.
    */
  def createConstraint(params: CreateConstraintInput): Request[CreateConstraintOutput, AWSError] = js.native
  def createConstraint(
    params: CreateConstraintInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConstraintOutput, Unit]
  ): Request[CreateConstraintOutput, AWSError] = js.native
  
  /**
    * Creates a portfolio. A delegated admin is authorized to invoke this command.
    */
  def createPortfolio(): Request[CreatePortfolioOutput, AWSError] = js.native
  def createPortfolio(callback: js.Function2[/* err */ AWSError, /* data */ CreatePortfolioOutput, Unit]): Request[CreatePortfolioOutput, AWSError] = js.native
  /**
    * Creates a portfolio. A delegated admin is authorized to invoke this command.
    */
  def createPortfolio(params: CreatePortfolioInput): Request[CreatePortfolioOutput, AWSError] = js.native
  def createPortfolio(
    params: CreatePortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePortfolioOutput, Unit]
  ): Request[CreatePortfolioOutput, AWSError] = js.native
  
  /**
    * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the management account of an organization or by a delegated administrator. You can share portfolios to an organization, an organizational unit, or a specific account. Note that if a delegated admin is de-registered, they can no longer create portfolio shares.  AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node. You can't share a shared resource. This includes portfolios that contain a shared product.
    */
  def createPortfolioShare(): Request[CreatePortfolioShareOutput, AWSError] = js.native
  def createPortfolioShare(callback: js.Function2[/* err */ AWSError, /* data */ CreatePortfolioShareOutput, Unit]): Request[CreatePortfolioShareOutput, AWSError] = js.native
  /**
    * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the management account of an organization or by a delegated administrator. You can share portfolios to an organization, an organizational unit, or a specific account. Note that if a delegated admin is de-registered, they can no longer create portfolio shares.  AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node. You can't share a shared resource. This includes portfolios that contain a shared product.
    */
  def createPortfolioShare(params: CreatePortfolioShareInput): Request[CreatePortfolioShareOutput, AWSError] = js.native
  def createPortfolioShare(
    params: CreatePortfolioShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePortfolioShareOutput, Unit]
  ): Request[CreatePortfolioShareOutput, AWSError] = js.native
  
  /**
    * Creates a product. A delegated admin is authorized to invoke this command.
    */
  def createProduct(): Request[CreateProductOutput, AWSError] = js.native
  def createProduct(callback: js.Function2[/* err */ AWSError, /* data */ CreateProductOutput, Unit]): Request[CreateProductOutput, AWSError] = js.native
  /**
    * Creates a product. A delegated admin is authorized to invoke this command.
    */
  def createProduct(params: CreateProductInput): Request[CreateProductOutput, AWSError] = js.native
  def createProduct(
    params: CreateProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProductOutput, Unit]
  ): Request[CreateProductOutput, AWSError] = js.native
  
  /**
    * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
    */
  def createProvisionedProductPlan(): Request[CreateProvisionedProductPlanOutput, AWSError] = js.native
  def createProvisionedProductPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisionedProductPlanOutput, Unit]): Request[CreateProvisionedProductPlanOutput, AWSError] = js.native
  /**
    * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
    */
  def createProvisionedProductPlan(params: CreateProvisionedProductPlanInput): Request[CreateProvisionedProductPlanOutput, AWSError] = js.native
  def createProvisionedProductPlan(
    params: CreateProvisionedProductPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisionedProductPlanOutput, Unit]
  ): Request[CreateProvisionedProductPlanOutput, AWSError] = js.native
  
  /**
    * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
    */
  def createProvisioningArtifact(): Request[CreateProvisioningArtifactOutput, AWSError] = js.native
  def createProvisioningArtifact(callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisioningArtifactOutput, Unit]): Request[CreateProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
    */
  def createProvisioningArtifact(params: CreateProvisioningArtifactInput): Request[CreateProvisioningArtifactOutput, AWSError] = js.native
  def createProvisioningArtifact(
    params: CreateProvisioningArtifactInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProvisioningArtifactOutput, Unit]
  ): Request[CreateProvisioningArtifactOutput, AWSError] = js.native
  
  /**
    * Creates a self-service action.
    */
  def createServiceAction(): Request[CreateServiceActionOutput, AWSError] = js.native
  def createServiceAction(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceActionOutput, Unit]): Request[CreateServiceActionOutput, AWSError] = js.native
  /**
    * Creates a self-service action.
    */
  def createServiceAction(params: CreateServiceActionInput): Request[CreateServiceActionOutput, AWSError] = js.native
  def createServiceAction(
    params: CreateServiceActionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceActionOutput, Unit]
  ): Request[CreateServiceActionOutput, AWSError] = js.native
  
  /**
    * Creates a TagOption.
    */
  def createTagOption(): Request[CreateTagOptionOutput, AWSError] = js.native
  def createTagOption(callback: js.Function2[/* err */ AWSError, /* data */ CreateTagOptionOutput, Unit]): Request[CreateTagOptionOutput, AWSError] = js.native
  /**
    * Creates a TagOption.
    */
  def createTagOption(params: CreateTagOptionInput): Request[CreateTagOptionOutput, AWSError] = js.native
  def createTagOption(
    params: CreateTagOptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTagOptionOutput, Unit]
  ): Request[CreateTagOptionOutput, AWSError] = js.native
  
  /**
    * Deletes the specified constraint. A delegated admin is authorized to invoke this command.
    */
  def deleteConstraint(): Request[DeleteConstraintOutput, AWSError] = js.native
  def deleteConstraint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConstraintOutput, Unit]): Request[DeleteConstraintOutput, AWSError] = js.native
  /**
    * Deletes the specified constraint. A delegated admin is authorized to invoke this command.
    */
  def deleteConstraint(params: DeleteConstraintInput): Request[DeleteConstraintOutput, AWSError] = js.native
  def deleteConstraint(
    params: DeleteConstraintInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConstraintOutput, Unit]
  ): Request[DeleteConstraintOutput, AWSError] = js.native
  
  /**
    * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts. A delegated admin is authorized to invoke this command.
    */
  def deletePortfolio(): Request[DeletePortfolioOutput, AWSError] = js.native
  def deletePortfolio(callback: js.Function2[/* err */ AWSError, /* data */ DeletePortfolioOutput, Unit]): Request[DeletePortfolioOutput, AWSError] = js.native
  /**
    * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts. A delegated admin is authorized to invoke this command.
    */
  def deletePortfolio(params: DeletePortfolioInput): Request[DeletePortfolioOutput, AWSError] = js.native
  def deletePortfolio(
    params: DeletePortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePortfolioOutput, Unit]
  ): Request[DeletePortfolioOutput, AWSError] = js.native
  
  /**
    * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the management account of an organization or by a delegated administrator. Note that if a delegated admin is de-registered, portfolio shares created from that account are removed.
    */
  def deletePortfolioShare(): Request[DeletePortfolioShareOutput, AWSError] = js.native
  def deletePortfolioShare(callback: js.Function2[/* err */ AWSError, /* data */ DeletePortfolioShareOutput, Unit]): Request[DeletePortfolioShareOutput, AWSError] = js.native
  /**
    * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the management account of an organization or by a delegated administrator. Note that if a delegated admin is de-registered, portfolio shares created from that account are removed.
    */
  def deletePortfolioShare(params: DeletePortfolioShareInput): Request[DeletePortfolioShareOutput, AWSError] = js.native
  def deletePortfolioShare(
    params: DeletePortfolioShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePortfolioShareOutput, Unit]
  ): Request[DeletePortfolioShareOutput, AWSError] = js.native
  
  /**
    * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio. A delegated admin is authorized to invoke this command.
    */
  def deleteProduct(): Request[DeleteProductOutput, AWSError] = js.native
  def deleteProduct(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProductOutput, Unit]): Request[DeleteProductOutput, AWSError] = js.native
  /**
    * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio. A delegated admin is authorized to invoke this command.
    */
  def deleteProduct(params: DeleteProductInput): Request[DeleteProductOutput, AWSError] = js.native
  def deleteProduct(
    params: DeleteProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProductOutput, Unit]
  ): Request[DeleteProductOutput, AWSError] = js.native
  
  /**
    * Deletes the specified plan.
    */
  def deleteProvisionedProductPlan(): Request[DeleteProvisionedProductPlanOutput, AWSError] = js.native
  def deleteProvisionedProductPlan(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProvisionedProductPlanOutput, Unit]): Request[DeleteProvisionedProductPlanOutput, AWSError] = js.native
  /**
    * Deletes the specified plan.
    */
  def deleteProvisionedProductPlan(params: DeleteProvisionedProductPlanInput): Request[DeleteProvisionedProductPlanOutput, AWSError] = js.native
  def deleteProvisionedProductPlan(
    params: DeleteProvisionedProductPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProvisionedProductPlanOutput, Unit]
  ): Request[DeleteProvisionedProductPlanOutput, AWSError] = js.native
  
  /**
    * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
    */
  def deleteProvisioningArtifact(): Request[DeleteProvisioningArtifactOutput, AWSError] = js.native
  def deleteProvisioningArtifact(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProvisioningArtifactOutput, Unit]): Request[DeleteProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
    */
  def deleteProvisioningArtifact(params: DeleteProvisioningArtifactInput): Request[DeleteProvisioningArtifactOutput, AWSError] = js.native
  def deleteProvisioningArtifact(
    params: DeleteProvisioningArtifactInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProvisioningArtifactOutput, Unit]
  ): Request[DeleteProvisioningArtifactOutput, AWSError] = js.native
  
  /**
    * Deletes a self-service action.
    */
  def deleteServiceAction(): Request[DeleteServiceActionOutput, AWSError] = js.native
  def deleteServiceAction(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceActionOutput, Unit]): Request[DeleteServiceActionOutput, AWSError] = js.native
  /**
    * Deletes a self-service action.
    */
  def deleteServiceAction(params: DeleteServiceActionInput): Request[DeleteServiceActionOutput, AWSError] = js.native
  def deleteServiceAction(
    params: DeleteServiceActionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceActionOutput, Unit]
  ): Request[DeleteServiceActionOutput, AWSError] = js.native
  
  /**
    * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
    */
  def deleteTagOption(): Request[DeleteTagOptionOutput, AWSError] = js.native
  def deleteTagOption(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagOptionOutput, Unit]): Request[DeleteTagOptionOutput, AWSError] = js.native
  /**
    * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
    */
  def deleteTagOption(params: DeleteTagOptionInput): Request[DeleteTagOptionOutput, AWSError] = js.native
  def deleteTagOption(
    params: DeleteTagOptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagOptionOutput, Unit]
  ): Request[DeleteTagOptionOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified constraint.
    */
  def describeConstraint(): Request[DescribeConstraintOutput, AWSError] = js.native
  def describeConstraint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConstraintOutput, Unit]): Request[DescribeConstraintOutput, AWSError] = js.native
  /**
    * Gets information about the specified constraint.
    */
  def describeConstraint(params: DescribeConstraintInput): Request[DescribeConstraintOutput, AWSError] = js.native
  def describeConstraint(
    params: DescribeConstraintInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConstraintOutput, Unit]
  ): Request[DescribeConstraintOutput, AWSError] = js.native
  
  /**
    * Gets the status of the specified copy product operation.
    */
  def describeCopyProductStatus(): Request[DescribeCopyProductStatusOutput, AWSError] = js.native
  def describeCopyProductStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCopyProductStatusOutput, Unit]): Request[DescribeCopyProductStatusOutput, AWSError] = js.native
  /**
    * Gets the status of the specified copy product operation.
    */
  def describeCopyProductStatus(params: DescribeCopyProductStatusInput): Request[DescribeCopyProductStatusOutput, AWSError] = js.native
  def describeCopyProductStatus(
    params: DescribeCopyProductStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCopyProductStatusOutput, Unit]
  ): Request[DescribeCopyProductStatusOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified portfolio. A delegated admin is authorized to invoke this command.
    */
  def describePortfolio(): Request[DescribePortfolioOutput, AWSError] = js.native
  def describePortfolio(callback: js.Function2[/* err */ AWSError, /* data */ DescribePortfolioOutput, Unit]): Request[DescribePortfolioOutput, AWSError] = js.native
  /**
    * Gets information about the specified portfolio. A delegated admin is authorized to invoke this command.
    */
  def describePortfolio(params: DescribePortfolioInput): Request[DescribePortfolioOutput, AWSError] = js.native
  def describePortfolio(
    params: DescribePortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePortfolioOutput, Unit]
  ): Request[DescribePortfolioOutput, AWSError] = js.native
  
  /**
    * Gets the status of the specified portfolio share operation. This API can only be called by the management account in the organization or by a delegated admin.
    */
  def describePortfolioShareStatus(): Request[DescribePortfolioShareStatusOutput, AWSError] = js.native
  def describePortfolioShareStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribePortfolioShareStatusOutput, Unit]): Request[DescribePortfolioShareStatusOutput, AWSError] = js.native
  /**
    * Gets the status of the specified portfolio share operation. This API can only be called by the management account in the organization or by a delegated admin.
    */
  def describePortfolioShareStatus(params: DescribePortfolioShareStatusInput): Request[DescribePortfolioShareStatusOutput, AWSError] = js.native
  def describePortfolioShareStatus(
    params: DescribePortfolioShareStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePortfolioShareStatusOutput, Unit]
  ): Request[DescribePortfolioShareStatusOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified product.
    */
  def describeProduct(): Request[DescribeProductOutput, AWSError] = js.native
  def describeProduct(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductOutput, Unit]): Request[DescribeProductOutput, AWSError] = js.native
  /**
    * Gets information about the specified product.
    */
  def describeProduct(params: DescribeProductInput): Request[DescribeProductOutput, AWSError] = js.native
  def describeProduct(
    params: DescribeProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductOutput, Unit]
  ): Request[DescribeProductOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified product. This operation is run with administrator access.
    */
  def describeProductAsAdmin(): Request[DescribeProductAsAdminOutput, AWSError] = js.native
  def describeProductAsAdmin(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductAsAdminOutput, Unit]): Request[DescribeProductAsAdminOutput, AWSError] = js.native
  /**
    * Gets information about the specified product. This operation is run with administrator access.
    */
  def describeProductAsAdmin(params: DescribeProductAsAdminInput): Request[DescribeProductAsAdminOutput, AWSError] = js.native
  def describeProductAsAdmin(
    params: DescribeProductAsAdminInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductAsAdminOutput, Unit]
  ): Request[DescribeProductAsAdminOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified product.
    */
  def describeProductView(): Request[DescribeProductViewOutput, AWSError] = js.native
  def describeProductView(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductViewOutput, Unit]): Request[DescribeProductViewOutput, AWSError] = js.native
  /**
    * Gets information about the specified product.
    */
  def describeProductView(params: DescribeProductViewInput): Request[DescribeProductViewOutput, AWSError] = js.native
  def describeProductView(
    params: DescribeProductViewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductViewOutput, Unit]
  ): Request[DescribeProductViewOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified provisioned product.
    */
  def describeProvisionedProduct(): Request[DescribeProvisionedProductOutput, AWSError] = js.native
  def describeProvisionedProduct(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisionedProductOutput, Unit]): Request[DescribeProvisionedProductOutput, AWSError] = js.native
  /**
    * Gets information about the specified provisioned product.
    */
  def describeProvisionedProduct(params: DescribeProvisionedProductInput): Request[DescribeProvisionedProductOutput, AWSError] = js.native
  def describeProvisionedProduct(
    params: DescribeProvisionedProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisionedProductOutput, Unit]
  ): Request[DescribeProvisionedProductOutput, AWSError] = js.native
  
  /**
    * Gets information about the resource changes for the specified plan.
    */
  def describeProvisionedProductPlan(): Request[DescribeProvisionedProductPlanOutput, AWSError] = js.native
  def describeProvisionedProductPlan(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisionedProductPlanOutput, Unit]): Request[DescribeProvisionedProductPlanOutput, AWSError] = js.native
  /**
    * Gets information about the resource changes for the specified plan.
    */
  def describeProvisionedProductPlan(params: DescribeProvisionedProductPlanInput): Request[DescribeProvisionedProductPlanOutput, AWSError] = js.native
  def describeProvisionedProductPlan(
    params: DescribeProvisionedProductPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisionedProductPlanOutput, Unit]
  ): Request[DescribeProvisionedProductPlanOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
    */
  def describeProvisioningArtifact(): Request[DescribeProvisioningArtifactOutput, AWSError] = js.native
  def describeProvisioningArtifact(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisioningArtifactOutput, Unit]): Request[DescribeProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
    */
  def describeProvisioningArtifact(params: DescribeProvisioningArtifactInput): Request[DescribeProvisioningArtifactOutput, AWSError] = js.native
  def describeProvisioningArtifact(
    params: DescribeProvisioningArtifactInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisioningArtifactOutput, Unit]
  ): Request[DescribeProvisioningArtifactOutput, AWSError] = js.native
  
  /**
    * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
    */
  def describeProvisioningParameters(): Request[DescribeProvisioningParametersOutput, AWSError] = js.native
  def describeProvisioningParameters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisioningParametersOutput, Unit]): Request[DescribeProvisioningParametersOutput, AWSError] = js.native
  /**
    * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
    */
  def describeProvisioningParameters(params: DescribeProvisioningParametersInput): Request[DescribeProvisioningParametersOutput, AWSError] = js.native
  def describeProvisioningParameters(
    params: DescribeProvisioningParametersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProvisioningParametersOutput, Unit]
  ): Request[DescribeProvisioningParametersOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct).   If a provisioned product was transferred to a new owner using UpdateProvisionedProductProperties, the new owner will be able to describe all past records for that product. The previous owner will no longer be able to describe the records, but will be able to use ListRecordHistory to see the product's history from when he was the owner. 
    */
  def describeRecord(): Request[DescribeRecordOutput, AWSError] = js.native
  def describeRecord(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecordOutput, Unit]): Request[DescribeRecordOutput, AWSError] = js.native
  /**
    * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct).   If a provisioned product was transferred to a new owner using UpdateProvisionedProductProperties, the new owner will be able to describe all past records for that product. The previous owner will no longer be able to describe the records, but will be able to use ListRecordHistory to see the product's history from when he was the owner. 
    */
  def describeRecord(params: DescribeRecordInput): Request[DescribeRecordOutput, AWSError] = js.native
  def describeRecord(
    params: DescribeRecordInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecordOutput, Unit]
  ): Request[DescribeRecordOutput, AWSError] = js.native
  
  /**
    * Describes a self-service action.
    */
  def describeServiceAction(): Request[DescribeServiceActionOutput, AWSError] = js.native
  def describeServiceAction(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceActionOutput, Unit]): Request[DescribeServiceActionOutput, AWSError] = js.native
  /**
    * Describes a self-service action.
    */
  def describeServiceAction(params: DescribeServiceActionInput): Request[DescribeServiceActionOutput, AWSError] = js.native
  def describeServiceAction(
    params: DescribeServiceActionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceActionOutput, Unit]
  ): Request[DescribeServiceActionOutput, AWSError] = js.native
  
  /**
    * Finds the default parameters for a specific self-service action on a specific provisioned product and returns a map of the results to the user.
    */
  def describeServiceActionExecutionParameters(): Request[DescribeServiceActionExecutionParametersOutput, AWSError] = js.native
  def describeServiceActionExecutionParameters(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceActionExecutionParametersOutput, Unit]
  ): Request[DescribeServiceActionExecutionParametersOutput, AWSError] = js.native
  /**
    * Finds the default parameters for a specific self-service action on a specific provisioned product and returns a map of the results to the user.
    */
  def describeServiceActionExecutionParameters(params: DescribeServiceActionExecutionParametersInput): Request[DescribeServiceActionExecutionParametersOutput, AWSError] = js.native
  def describeServiceActionExecutionParameters(
    params: DescribeServiceActionExecutionParametersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceActionExecutionParametersOutput, Unit]
  ): Request[DescribeServiceActionExecutionParametersOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified TagOption.
    */
  def describeTagOption(): Request[DescribeTagOptionOutput, AWSError] = js.native
  def describeTagOption(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagOptionOutput, Unit]): Request[DescribeTagOptionOutput, AWSError] = js.native
  /**
    * Gets information about the specified TagOption.
    */
  def describeTagOption(params: DescribeTagOptionInput): Request[DescribeTagOptionOutput, AWSError] = js.native
  def describeTagOption(
    params: DescribeTagOptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagOptionOutput, Unit]
  ): Request[DescribeTagOptionOutput, AWSError] = js.native
  
  /**
    * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the management account in the organization. This API can't be invoked if there are active delegated administrators in the organization. Note that a delegated administrator is not authorized to invoke DisableAWSOrganizationsAccess.
    */
  def disableAWSOrganizationsAccess(): Request[DisableAWSOrganizationsAccessOutput, AWSError] = js.native
  def disableAWSOrganizationsAccess(callback: js.Function2[/* err */ AWSError, /* data */ DisableAWSOrganizationsAccessOutput, Unit]): Request[DisableAWSOrganizationsAccessOutput, AWSError] = js.native
  /**
    * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the management account in the organization. This API can't be invoked if there are active delegated administrators in the organization. Note that a delegated administrator is not authorized to invoke DisableAWSOrganizationsAccess.
    */
  def disableAWSOrganizationsAccess(params: DisableAWSOrganizationsAccessInput): Request[DisableAWSOrganizationsAccessOutput, AWSError] = js.native
  def disableAWSOrganizationsAccess(
    params: DisableAWSOrganizationsAccessInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableAWSOrganizationsAccessOutput, Unit]
  ): Request[DisableAWSOrganizationsAccessOutput, AWSError] = js.native
  
  /**
    * Disassociates the specified budget from the specified resource.
    */
  def disassociateBudgetFromResource(): Request[DisassociateBudgetFromResourceOutput, AWSError] = js.native
  def disassociateBudgetFromResource(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateBudgetFromResourceOutput, Unit]): Request[DisassociateBudgetFromResourceOutput, AWSError] = js.native
  /**
    * Disassociates the specified budget from the specified resource.
    */
  def disassociateBudgetFromResource(params: DisassociateBudgetFromResourceInput): Request[DisassociateBudgetFromResourceOutput, AWSError] = js.native
  def disassociateBudgetFromResource(
    params: DisassociateBudgetFromResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateBudgetFromResourceOutput, Unit]
  ): Request[DisassociateBudgetFromResourceOutput, AWSError] = js.native
  
  /**
    * Disassociates a previously associated principal ARN from a specified portfolio.
    */
  def disassociatePrincipalFromPortfolio(): Request[DisassociatePrincipalFromPortfolioOutput, AWSError] = js.native
  def disassociatePrincipalFromPortfolio(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociatePrincipalFromPortfolioOutput, Unit]
  ): Request[DisassociatePrincipalFromPortfolioOutput, AWSError] = js.native
  /**
    * Disassociates a previously associated principal ARN from a specified portfolio.
    */
  def disassociatePrincipalFromPortfolio(params: DisassociatePrincipalFromPortfolioInput): Request[DisassociatePrincipalFromPortfolioOutput, AWSError] = js.native
  def disassociatePrincipalFromPortfolio(
    params: DisassociatePrincipalFromPortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociatePrincipalFromPortfolioOutput, Unit]
  ): Request[DisassociatePrincipalFromPortfolioOutput, AWSError] = js.native
  
  /**
    * Disassociates the specified product from the specified portfolio.  A delegated admin is authorized to invoke this command.
    */
  def disassociateProductFromPortfolio(): Request[DisassociateProductFromPortfolioOutput, AWSError] = js.native
  def disassociateProductFromPortfolio(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateProductFromPortfolioOutput, Unit]
  ): Request[DisassociateProductFromPortfolioOutput, AWSError] = js.native
  /**
    * Disassociates the specified product from the specified portfolio.  A delegated admin is authorized to invoke this command.
    */
  def disassociateProductFromPortfolio(params: DisassociateProductFromPortfolioInput): Request[DisassociateProductFromPortfolioOutput, AWSError] = js.native
  def disassociateProductFromPortfolio(
    params: DisassociateProductFromPortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateProductFromPortfolioOutput, Unit]
  ): Request[DisassociateProductFromPortfolioOutput, AWSError] = js.native
  
  /**
    * Disassociates the specified self-service action association from the specified provisioning artifact.
    */
  def disassociateServiceActionFromProvisioningArtifact(): Request[DisassociateServiceActionFromProvisioningArtifactOutput, AWSError] = js.native
  def disassociateServiceActionFromProvisioningArtifact(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateServiceActionFromProvisioningArtifactOutput, 
      Unit
    ]
  ): Request[DisassociateServiceActionFromProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Disassociates the specified self-service action association from the specified provisioning artifact.
    */
  def disassociateServiceActionFromProvisioningArtifact(params: DisassociateServiceActionFromProvisioningArtifactInput): Request[DisassociateServiceActionFromProvisioningArtifactOutput, AWSError] = js.native
  def disassociateServiceActionFromProvisioningArtifact(
    params: DisassociateServiceActionFromProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateServiceActionFromProvisioningArtifactOutput, 
      Unit
    ]
  ): Request[DisassociateServiceActionFromProvisioningArtifactOutput, AWSError] = js.native
  
  /**
    * Disassociates the specified TagOption from the specified resource.
    */
  def disassociateTagOptionFromResource(): Request[DisassociateTagOptionFromResourceOutput, AWSError] = js.native
  def disassociateTagOptionFromResource(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTagOptionFromResourceOutput, Unit]
  ): Request[DisassociateTagOptionFromResourceOutput, AWSError] = js.native
  /**
    * Disassociates the specified TagOption from the specified resource.
    */
  def disassociateTagOptionFromResource(params: DisassociateTagOptionFromResourceInput): Request[DisassociateTagOptionFromResourceOutput, AWSError] = js.native
  def disassociateTagOptionFromResource(
    params: DisassociateTagOptionFromResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTagOptionFromResourceOutput, Unit]
  ): Request[DisassociateTagOptionFromResourceOutput, AWSError] = js.native
  
  /**
    * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the management account in the organization. By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure. Note that a delegated administrator is not authorized to invoke EnableAWSOrganizationsAccess.
    */
  def enableAWSOrganizationsAccess(): Request[EnableAWSOrganizationsAccessOutput, AWSError] = js.native
  def enableAWSOrganizationsAccess(callback: js.Function2[/* err */ AWSError, /* data */ EnableAWSOrganizationsAccessOutput, Unit]): Request[EnableAWSOrganizationsAccessOutput, AWSError] = js.native
  /**
    * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the management account in the organization. By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure. Note that a delegated administrator is not authorized to invoke EnableAWSOrganizationsAccess.
    */
  def enableAWSOrganizationsAccess(params: EnableAWSOrganizationsAccessInput): Request[EnableAWSOrganizationsAccessOutput, AWSError] = js.native
  def enableAWSOrganizationsAccess(
    params: EnableAWSOrganizationsAccessInput,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableAWSOrganizationsAccessOutput, Unit]
  ): Request[EnableAWSOrganizationsAccessOutput, AWSError] = js.native
  
  /**
    * Provisions or modifies a product based on the resource changes for the specified plan.
    */
  def executeProvisionedProductPlan(): Request[ExecuteProvisionedProductPlanOutput, AWSError] = js.native
  def executeProvisionedProductPlan(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteProvisionedProductPlanOutput, Unit]): Request[ExecuteProvisionedProductPlanOutput, AWSError] = js.native
  /**
    * Provisions or modifies a product based on the resource changes for the specified plan.
    */
  def executeProvisionedProductPlan(params: ExecuteProvisionedProductPlanInput): Request[ExecuteProvisionedProductPlanOutput, AWSError] = js.native
  def executeProvisionedProductPlan(
    params: ExecuteProvisionedProductPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteProvisionedProductPlanOutput, Unit]
  ): Request[ExecuteProvisionedProductPlanOutput, AWSError] = js.native
  
  /**
    * Executes a self-service action against a provisioned product.
    */
  def executeProvisionedProductServiceAction(): Request[ExecuteProvisionedProductServiceActionOutput, AWSError] = js.native
  def executeProvisionedProductServiceAction(
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteProvisionedProductServiceActionOutput, Unit]
  ): Request[ExecuteProvisionedProductServiceActionOutput, AWSError] = js.native
  /**
    * Executes a self-service action against a provisioned product.
    */
  def executeProvisionedProductServiceAction(params: ExecuteProvisionedProductServiceActionInput): Request[ExecuteProvisionedProductServiceActionOutput, AWSError] = js.native
  def executeProvisionedProductServiceAction(
    params: ExecuteProvisionedProductServiceActionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteProvisionedProductServiceActionOutput, Unit]
  ): Request[ExecuteProvisionedProductServiceActionOutput, AWSError] = js.native
  
  /**
    * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the management account in the organization or by a delegated admin.
    */
  def getAWSOrganizationsAccessStatus(): Request[GetAWSOrganizationsAccessStatusOutput, AWSError] = js.native
  def getAWSOrganizationsAccessStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetAWSOrganizationsAccessStatusOutput, Unit]): Request[GetAWSOrganizationsAccessStatusOutput, AWSError] = js.native
  /**
    * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the management account in the organization or by a delegated admin.
    */
  def getAWSOrganizationsAccessStatus(params: GetAWSOrganizationsAccessStatusInput): Request[GetAWSOrganizationsAccessStatusOutput, AWSError] = js.native
  def getAWSOrganizationsAccessStatus(
    params: GetAWSOrganizationsAccessStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAWSOrganizationsAccessStatusOutput, Unit]
  ): Request[GetAWSOrganizationsAccessStatusOutput, AWSError] = js.native
  
  /**
    * This API takes either a ProvisonedProductId or a ProvisionedProductName, along with a list of one or more output keys, and responds with the key/value pairs of those outputs.
    */
  def getProvisionedProductOutputs(): Request[GetProvisionedProductOutputsOutput, AWSError] = js.native
  def getProvisionedProductOutputs(callback: js.Function2[/* err */ AWSError, /* data */ GetProvisionedProductOutputsOutput, Unit]): Request[GetProvisionedProductOutputsOutput, AWSError] = js.native
  /**
    * This API takes either a ProvisonedProductId or a ProvisionedProductName, along with a list of one or more output keys, and responds with the key/value pairs of those outputs.
    */
  def getProvisionedProductOutputs(params: GetProvisionedProductOutputsInput): Request[GetProvisionedProductOutputsOutput, AWSError] = js.native
  def getProvisionedProductOutputs(
    params: GetProvisionedProductOutputsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProvisionedProductOutputsOutput, Unit]
  ): Request[GetProvisionedProductOutputsOutput, AWSError] = js.native
  
  /**
    * Requests the import of a resource as a Service Catalog provisioned product that is associated to a Service Catalog product and provisioning artifact. Once imported all supported Service Catalog governance actions are supported on the provisioned product. Resource import only supports CloudFormation stack ARNs. CloudFormation StackSets and non-root nested stacks are not supported. The CloudFormation stack must have one of the following statuses to be imported: CREATE_COMPLETE, UPDATE_COMPLETE, UPDATE_ROLLBACK_COMPLETE, IMPORT_COMPLETE, IMPORT_ROLLBACK_COMPLETE. Import of the resource requires that the CloudFormation stack template matches the associated Service Catalog product provisioning artifact. 
    */
  def importAsProvisionedProduct(): Request[ImportAsProvisionedProductOutput, AWSError] = js.native
  def importAsProvisionedProduct(callback: js.Function2[/* err */ AWSError, /* data */ ImportAsProvisionedProductOutput, Unit]): Request[ImportAsProvisionedProductOutput, AWSError] = js.native
  /**
    * Requests the import of a resource as a Service Catalog provisioned product that is associated to a Service Catalog product and provisioning artifact. Once imported all supported Service Catalog governance actions are supported on the provisioned product. Resource import only supports CloudFormation stack ARNs. CloudFormation StackSets and non-root nested stacks are not supported. The CloudFormation stack must have one of the following statuses to be imported: CREATE_COMPLETE, UPDATE_COMPLETE, UPDATE_ROLLBACK_COMPLETE, IMPORT_COMPLETE, IMPORT_ROLLBACK_COMPLETE. Import of the resource requires that the CloudFormation stack template matches the associated Service Catalog product provisioning artifact. 
    */
  def importAsProvisionedProduct(params: ImportAsProvisionedProductInput): Request[ImportAsProvisionedProductOutput, AWSError] = js.native
  def importAsProvisionedProduct(
    params: ImportAsProvisionedProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportAsProvisionedProductOutput, Unit]
  ): Request[ImportAsProvisionedProductOutput, AWSError] = js.native
  
  /**
    * Lists all portfolios for which sharing was accepted by this account.
    */
  def listAcceptedPortfolioShares(): Request[ListAcceptedPortfolioSharesOutput, AWSError] = js.native
  def listAcceptedPortfolioShares(callback: js.Function2[/* err */ AWSError, /* data */ ListAcceptedPortfolioSharesOutput, Unit]): Request[ListAcceptedPortfolioSharesOutput, AWSError] = js.native
  /**
    * Lists all portfolios for which sharing was accepted by this account.
    */
  def listAcceptedPortfolioShares(params: ListAcceptedPortfolioSharesInput): Request[ListAcceptedPortfolioSharesOutput, AWSError] = js.native
  def listAcceptedPortfolioShares(
    params: ListAcceptedPortfolioSharesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAcceptedPortfolioSharesOutput, Unit]
  ): Request[ListAcceptedPortfolioSharesOutput, AWSError] = js.native
  
  /**
    * Lists all the budgets associated to the specified resource.
    */
  def listBudgetsForResource(): Request[ListBudgetsForResourceOutput, AWSError] = js.native
  def listBudgetsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListBudgetsForResourceOutput, Unit]): Request[ListBudgetsForResourceOutput, AWSError] = js.native
  /**
    * Lists all the budgets associated to the specified resource.
    */
  def listBudgetsForResource(params: ListBudgetsForResourceInput): Request[ListBudgetsForResourceOutput, AWSError] = js.native
  def listBudgetsForResource(
    params: ListBudgetsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBudgetsForResourceOutput, Unit]
  ): Request[ListBudgetsForResourceOutput, AWSError] = js.native
  
  /**
    * Lists the constraints for the specified portfolio and product.
    */
  def listConstraintsForPortfolio(): Request[ListConstraintsForPortfolioOutput, AWSError] = js.native
  def listConstraintsForPortfolio(callback: js.Function2[/* err */ AWSError, /* data */ ListConstraintsForPortfolioOutput, Unit]): Request[ListConstraintsForPortfolioOutput, AWSError] = js.native
  /**
    * Lists the constraints for the specified portfolio and product.
    */
  def listConstraintsForPortfolio(params: ListConstraintsForPortfolioInput): Request[ListConstraintsForPortfolioOutput, AWSError] = js.native
  def listConstraintsForPortfolio(
    params: ListConstraintsForPortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConstraintsForPortfolioOutput, Unit]
  ): Request[ListConstraintsForPortfolioOutput, AWSError] = js.native
  
  /**
    * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
    */
  def listLaunchPaths(): Request[ListLaunchPathsOutput, AWSError] = js.native
  def listLaunchPaths(callback: js.Function2[/* err */ AWSError, /* data */ ListLaunchPathsOutput, Unit]): Request[ListLaunchPathsOutput, AWSError] = js.native
  /**
    * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
    */
  def listLaunchPaths(params: ListLaunchPathsInput): Request[ListLaunchPathsOutput, AWSError] = js.native
  def listLaunchPaths(
    params: ListLaunchPathsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLaunchPathsOutput, Unit]
  ): Request[ListLaunchPathsOutput, AWSError] = js.native
  
  /**
    * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the management account in the organization or by a delegated admin. If a delegated admin is de-registered, they can no longer perform this operation.
    */
  def listOrganizationPortfolioAccess(): Request[ListOrganizationPortfolioAccessOutput, AWSError] = js.native
  def listOrganizationPortfolioAccess(callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationPortfolioAccessOutput, Unit]): Request[ListOrganizationPortfolioAccessOutput, AWSError] = js.native
  /**
    * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the management account in the organization or by a delegated admin. If a delegated admin is de-registered, they can no longer perform this operation.
    */
  def listOrganizationPortfolioAccess(params: ListOrganizationPortfolioAccessInput): Request[ListOrganizationPortfolioAccessOutput, AWSError] = js.native
  def listOrganizationPortfolioAccess(
    params: ListOrganizationPortfolioAccessInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationPortfolioAccessOutput, Unit]
  ): Request[ListOrganizationPortfolioAccessOutput, AWSError] = js.native
  
  /**
    * Lists the account IDs that have access to the specified portfolio. A delegated admin can list the accounts that have access to the shared portfolio. Note that if a delegated admin is de-registered, they can no longer perform this operation.
    */
  def listPortfolioAccess(): Request[ListPortfolioAccessOutput, AWSError] = js.native
  def listPortfolioAccess(callback: js.Function2[/* err */ AWSError, /* data */ ListPortfolioAccessOutput, Unit]): Request[ListPortfolioAccessOutput, AWSError] = js.native
  /**
    * Lists the account IDs that have access to the specified portfolio. A delegated admin can list the accounts that have access to the shared portfolio. Note that if a delegated admin is de-registered, they can no longer perform this operation.
    */
  def listPortfolioAccess(params: ListPortfolioAccessInput): Request[ListPortfolioAccessOutput, AWSError] = js.native
  def listPortfolioAccess(
    params: ListPortfolioAccessInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPortfolioAccessOutput, Unit]
  ): Request[ListPortfolioAccessOutput, AWSError] = js.native
  
  /**
    * Lists all portfolios in the catalog.
    */
  def listPortfolios(): Request[ListPortfoliosOutput, AWSError] = js.native
  def listPortfolios(callback: js.Function2[/* err */ AWSError, /* data */ ListPortfoliosOutput, Unit]): Request[ListPortfoliosOutput, AWSError] = js.native
  /**
    * Lists all portfolios in the catalog.
    */
  def listPortfolios(params: ListPortfoliosInput): Request[ListPortfoliosOutput, AWSError] = js.native
  def listPortfolios(
    params: ListPortfoliosInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPortfoliosOutput, Unit]
  ): Request[ListPortfoliosOutput, AWSError] = js.native
  
  /**
    * Lists all portfolios that the specified product is associated with.
    */
  def listPortfoliosForProduct(): Request[ListPortfoliosForProductOutput, AWSError] = js.native
  def listPortfoliosForProduct(callback: js.Function2[/* err */ AWSError, /* data */ ListPortfoliosForProductOutput, Unit]): Request[ListPortfoliosForProductOutput, AWSError] = js.native
  /**
    * Lists all portfolios that the specified product is associated with.
    */
  def listPortfoliosForProduct(params: ListPortfoliosForProductInput): Request[ListPortfoliosForProductOutput, AWSError] = js.native
  def listPortfoliosForProduct(
    params: ListPortfoliosForProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPortfoliosForProductOutput, Unit]
  ): Request[ListPortfoliosForProductOutput, AWSError] = js.native
  
  /**
    * Lists all principal ARNs associated with the specified portfolio.
    */
  def listPrincipalsForPortfolio(): Request[ListPrincipalsForPortfolioOutput, AWSError] = js.native
  def listPrincipalsForPortfolio(callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsForPortfolioOutput, Unit]): Request[ListPrincipalsForPortfolioOutput, AWSError] = js.native
  /**
    * Lists all principal ARNs associated with the specified portfolio.
    */
  def listPrincipalsForPortfolio(params: ListPrincipalsForPortfolioInput): Request[ListPrincipalsForPortfolioOutput, AWSError] = js.native
  def listPrincipalsForPortfolio(
    params: ListPrincipalsForPortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsForPortfolioOutput, Unit]
  ): Request[ListPrincipalsForPortfolioOutput, AWSError] = js.native
  
  /**
    * Lists the plans for the specified provisioned product or all plans to which the user has access.
    */
  def listProvisionedProductPlans(): Request[ListProvisionedProductPlansOutput, AWSError] = js.native
  def listProvisionedProductPlans(callback: js.Function2[/* err */ AWSError, /* data */ ListProvisionedProductPlansOutput, Unit]): Request[ListProvisionedProductPlansOutput, AWSError] = js.native
  /**
    * Lists the plans for the specified provisioned product or all plans to which the user has access.
    */
  def listProvisionedProductPlans(params: ListProvisionedProductPlansInput): Request[ListProvisionedProductPlansOutput, AWSError] = js.native
  def listProvisionedProductPlans(
    params: ListProvisionedProductPlansInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisionedProductPlansOutput, Unit]
  ): Request[ListProvisionedProductPlansOutput, AWSError] = js.native
  
  /**
    * Lists all provisioning artifacts (also known as versions) for the specified product.
    */
  def listProvisioningArtifacts(): Request[ListProvisioningArtifactsOutput, AWSError] = js.native
  def listProvisioningArtifacts(callback: js.Function2[/* err */ AWSError, /* data */ ListProvisioningArtifactsOutput, Unit]): Request[ListProvisioningArtifactsOutput, AWSError] = js.native
  /**
    * Lists all provisioning artifacts (also known as versions) for the specified product.
    */
  def listProvisioningArtifacts(params: ListProvisioningArtifactsInput): Request[ListProvisioningArtifactsOutput, AWSError] = js.native
  def listProvisioningArtifacts(
    params: ListProvisioningArtifactsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisioningArtifactsOutput, Unit]
  ): Request[ListProvisioningArtifactsOutput, AWSError] = js.native
  
  /**
    * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
    */
  def listProvisioningArtifactsForServiceAction(): Request[ListProvisioningArtifactsForServiceActionOutput, AWSError] = js.native
  def listProvisioningArtifactsForServiceAction(
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisioningArtifactsForServiceActionOutput, Unit]
  ): Request[ListProvisioningArtifactsForServiceActionOutput, AWSError] = js.native
  /**
    * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
    */
  def listProvisioningArtifactsForServiceAction(params: ListProvisioningArtifactsForServiceActionInput): Request[ListProvisioningArtifactsForServiceActionOutput, AWSError] = js.native
  def listProvisioningArtifactsForServiceAction(
    params: ListProvisioningArtifactsForServiceActionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisioningArtifactsForServiceActionOutput, Unit]
  ): Request[ListProvisioningArtifactsForServiceActionOutput, AWSError] = js.native
  
  /**
    * Lists the specified requests or all performed requests.
    */
  def listRecordHistory(): Request[ListRecordHistoryOutput, AWSError] = js.native
  def listRecordHistory(callback: js.Function2[/* err */ AWSError, /* data */ ListRecordHistoryOutput, Unit]): Request[ListRecordHistoryOutput, AWSError] = js.native
  /**
    * Lists the specified requests or all performed requests.
    */
  def listRecordHistory(params: ListRecordHistoryInput): Request[ListRecordHistoryOutput, AWSError] = js.native
  def listRecordHistory(
    params: ListRecordHistoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecordHistoryOutput, Unit]
  ): Request[ListRecordHistoryOutput, AWSError] = js.native
  
  /**
    * Lists the resources associated with the specified TagOption.
    */
  def listResourcesForTagOption(): Request[ListResourcesForTagOptionOutput, AWSError] = js.native
  def listResourcesForTagOption(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesForTagOptionOutput, Unit]): Request[ListResourcesForTagOptionOutput, AWSError] = js.native
  /**
    * Lists the resources associated with the specified TagOption.
    */
  def listResourcesForTagOption(params: ListResourcesForTagOptionInput): Request[ListResourcesForTagOptionOutput, AWSError] = js.native
  def listResourcesForTagOption(
    params: ListResourcesForTagOptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesForTagOptionOutput, Unit]
  ): Request[ListResourcesForTagOptionOutput, AWSError] = js.native
  
  /**
    * Lists all self-service actions.
    */
  def listServiceActions(): Request[ListServiceActionsOutput, AWSError] = js.native
  def listServiceActions(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceActionsOutput, Unit]): Request[ListServiceActionsOutput, AWSError] = js.native
  /**
    * Lists all self-service actions.
    */
  def listServiceActions(params: ListServiceActionsInput): Request[ListServiceActionsOutput, AWSError] = js.native
  def listServiceActions(
    params: ListServiceActionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceActionsOutput, Unit]
  ): Request[ListServiceActionsOutput, AWSError] = js.native
  
  /**
    * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
    */
  def listServiceActionsForProvisioningArtifact(): Request[ListServiceActionsForProvisioningArtifactOutput, AWSError] = js.native
  def listServiceActionsForProvisioningArtifact(
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceActionsForProvisioningArtifactOutput, Unit]
  ): Request[ListServiceActionsForProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
    */
  def listServiceActionsForProvisioningArtifact(params: ListServiceActionsForProvisioningArtifactInput): Request[ListServiceActionsForProvisioningArtifactOutput, AWSError] = js.native
  def listServiceActionsForProvisioningArtifact(
    params: ListServiceActionsForProvisioningArtifactInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceActionsForProvisioningArtifactOutput, Unit]
  ): Request[ListServiceActionsForProvisioningArtifactOutput, AWSError] = js.native
  
  /**
    * Returns summary information about stack instances that are associated with the specified CFN_STACKSET type provisioned product. You can filter for stack instances that are associated with a specific AWS account name or region. 
    */
  def listStackInstancesForProvisionedProduct(): Request[ListStackInstancesForProvisionedProductOutput, AWSError] = js.native
  def listStackInstancesForProvisionedProduct(
    callback: js.Function2[/* err */ AWSError, /* data */ ListStackInstancesForProvisionedProductOutput, Unit]
  ): Request[ListStackInstancesForProvisionedProductOutput, AWSError] = js.native
  /**
    * Returns summary information about stack instances that are associated with the specified CFN_STACKSET type provisioned product. You can filter for stack instances that are associated with a specific AWS account name or region. 
    */
  def listStackInstancesForProvisionedProduct(params: ListStackInstancesForProvisionedProductInput): Request[ListStackInstancesForProvisionedProductOutput, AWSError] = js.native
  def listStackInstancesForProvisionedProduct(
    params: ListStackInstancesForProvisionedProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStackInstancesForProvisionedProductOutput, Unit]
  ): Request[ListStackInstancesForProvisionedProductOutput, AWSError] = js.native
  
  /**
    * Lists the specified TagOptions or all TagOptions.
    */
  def listTagOptions(): Request[ListTagOptionsOutput, AWSError] = js.native
  def listTagOptions(callback: js.Function2[/* err */ AWSError, /* data */ ListTagOptionsOutput, Unit]): Request[ListTagOptionsOutput, AWSError] = js.native
  /**
    * Lists the specified TagOptions or all TagOptions.
    */
  def listTagOptions(params: ListTagOptionsInput): Request[ListTagOptionsOutput, AWSError] = js.native
  def listTagOptions(
    params: ListTagOptionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagOptionsOutput, Unit]
  ): Request[ListTagOptionsOutput, AWSError] = js.native
  
  /**
    * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
    */
  def provisionProduct(): Request[ProvisionProductOutput, AWSError] = js.native
  def provisionProduct(callback: js.Function2[/* err */ AWSError, /* data */ ProvisionProductOutput, Unit]): Request[ProvisionProductOutput, AWSError] = js.native
  /**
    * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
    */
  def provisionProduct(params: ProvisionProductInput): Request[ProvisionProductOutput, AWSError] = js.native
  def provisionProduct(
    params: ProvisionProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ProvisionProductOutput, Unit]
  ): Request[ProvisionProductOutput, AWSError] = js.native
  
  /**
    * Rejects an offer to share the specified portfolio.
    */
  def rejectPortfolioShare(): Request[RejectPortfolioShareOutput, AWSError] = js.native
  def rejectPortfolioShare(callback: js.Function2[/* err */ AWSError, /* data */ RejectPortfolioShareOutput, Unit]): Request[RejectPortfolioShareOutput, AWSError] = js.native
  /**
    * Rejects an offer to share the specified portfolio.
    */
  def rejectPortfolioShare(params: RejectPortfolioShareInput): Request[RejectPortfolioShareOutput, AWSError] = js.native
  def rejectPortfolioShare(
    params: RejectPortfolioShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectPortfolioShareOutput, Unit]
  ): Request[RejectPortfolioShareOutput, AWSError] = js.native
  
  /**
    * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
    */
  def scanProvisionedProducts(): Request[ScanProvisionedProductsOutput, AWSError] = js.native
  def scanProvisionedProducts(callback: js.Function2[/* err */ AWSError, /* data */ ScanProvisionedProductsOutput, Unit]): Request[ScanProvisionedProductsOutput, AWSError] = js.native
  /**
    * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
    */
  def scanProvisionedProducts(params: ScanProvisionedProductsInput): Request[ScanProvisionedProductsOutput, AWSError] = js.native
  def scanProvisionedProducts(
    params: ScanProvisionedProductsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ScanProvisionedProductsOutput, Unit]
  ): Request[ScanProvisionedProductsOutput, AWSError] = js.native
  
  /**
    * Gets information about the products to which the caller has access.
    */
  def searchProducts(): Request[SearchProductsOutput, AWSError] = js.native
  def searchProducts(callback: js.Function2[/* err */ AWSError, /* data */ SearchProductsOutput, Unit]): Request[SearchProductsOutput, AWSError] = js.native
  /**
    * Gets information about the products to which the caller has access.
    */
  def searchProducts(params: SearchProductsInput): Request[SearchProductsOutput, AWSError] = js.native
  def searchProducts(
    params: SearchProductsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchProductsOutput, Unit]
  ): Request[SearchProductsOutput, AWSError] = js.native
  
  /**
    * Gets information about the products for the specified portfolio or all products.
    */
  def searchProductsAsAdmin(): Request[SearchProductsAsAdminOutput, AWSError] = js.native
  def searchProductsAsAdmin(callback: js.Function2[/* err */ AWSError, /* data */ SearchProductsAsAdminOutput, Unit]): Request[SearchProductsAsAdminOutput, AWSError] = js.native
  /**
    * Gets information about the products for the specified portfolio or all products.
    */
  def searchProductsAsAdmin(params: SearchProductsAsAdminInput): Request[SearchProductsAsAdminOutput, AWSError] = js.native
  def searchProductsAsAdmin(
    params: SearchProductsAsAdminInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchProductsAsAdminOutput, Unit]
  ): Request[SearchProductsAsAdminOutput, AWSError] = js.native
  
  /**
    * Gets information about the provisioned products that meet the specified criteria.
    */
  def searchProvisionedProducts(): Request[SearchProvisionedProductsOutput, AWSError] = js.native
  def searchProvisionedProducts(callback: js.Function2[/* err */ AWSError, /* data */ SearchProvisionedProductsOutput, Unit]): Request[SearchProvisionedProductsOutput, AWSError] = js.native
  /**
    * Gets information about the provisioned products that meet the specified criteria.
    */
  def searchProvisionedProducts(params: SearchProvisionedProductsInput): Request[SearchProvisionedProductsOutput, AWSError] = js.native
  def searchProvisionedProducts(
    params: SearchProvisionedProductsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchProvisionedProductsOutput, Unit]
  ): Request[SearchProvisionedProductsOutput, AWSError] = js.native
  
  /**
    * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
    */
  def terminateProvisionedProduct(): Request[TerminateProvisionedProductOutput, AWSError] = js.native
  def terminateProvisionedProduct(callback: js.Function2[/* err */ AWSError, /* data */ TerminateProvisionedProductOutput, Unit]): Request[TerminateProvisionedProductOutput, AWSError] = js.native
  /**
    * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
    */
  def terminateProvisionedProduct(params: TerminateProvisionedProductInput): Request[TerminateProvisionedProductOutput, AWSError] = js.native
  def terminateProvisionedProduct(
    params: TerminateProvisionedProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateProvisionedProductOutput, Unit]
  ): Request[TerminateProvisionedProductOutput, AWSError] = js.native
  
  /**
    * Updates the specified constraint.
    */
  def updateConstraint(): Request[UpdateConstraintOutput, AWSError] = js.native
  def updateConstraint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConstraintOutput, Unit]): Request[UpdateConstraintOutput, AWSError] = js.native
  /**
    * Updates the specified constraint.
    */
  def updateConstraint(params: UpdateConstraintInput): Request[UpdateConstraintOutput, AWSError] = js.native
  def updateConstraint(
    params: UpdateConstraintInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConstraintOutput, Unit]
  ): Request[UpdateConstraintOutput, AWSError] = js.native
  
  /**
    * Updates the specified portfolio. You cannot update a product that was shared with you.
    */
  def updatePortfolio(): Request[UpdatePortfolioOutput, AWSError] = js.native
  def updatePortfolio(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePortfolioOutput, Unit]): Request[UpdatePortfolioOutput, AWSError] = js.native
  /**
    * Updates the specified portfolio. You cannot update a product that was shared with you.
    */
  def updatePortfolio(params: UpdatePortfolioInput): Request[UpdatePortfolioOutput, AWSError] = js.native
  def updatePortfolio(
    params: UpdatePortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePortfolioOutput, Unit]
  ): Request[UpdatePortfolioOutput, AWSError] = js.native
  
  /**
    * Updates the specified product.
    */
  def updateProduct(): Request[UpdateProductOutput, AWSError] = js.native
  def updateProduct(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProductOutput, Unit]): Request[UpdateProductOutput, AWSError] = js.native
  /**
    * Updates the specified product.
    */
  def updateProduct(params: UpdateProductInput): Request[UpdateProductOutput, AWSError] = js.native
  def updateProduct(
    params: UpdateProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProductOutput, Unit]
  ): Request[UpdateProductOutput, AWSError] = js.native
  
  /**
    * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
    */
  def updateProvisionedProduct(): Request[UpdateProvisionedProductOutput, AWSError] = js.native
  def updateProvisionedProduct(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProvisionedProductOutput, Unit]): Request[UpdateProvisionedProductOutput, AWSError] = js.native
  /**
    * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
    */
  def updateProvisionedProduct(params: UpdateProvisionedProductInput): Request[UpdateProvisionedProductOutput, AWSError] = js.native
  def updateProvisionedProduct(
    params: UpdateProvisionedProductInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProvisionedProductOutput, Unit]
  ): Request[UpdateProvisionedProductOutput, AWSError] = js.native
  
  /**
    * Requests updates to the properties of the specified provisioned product.
    */
  def updateProvisionedProductProperties(): Request[UpdateProvisionedProductPropertiesOutput, AWSError] = js.native
  def updateProvisionedProductProperties(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProvisionedProductPropertiesOutput, Unit]
  ): Request[UpdateProvisionedProductPropertiesOutput, AWSError] = js.native
  /**
    * Requests updates to the properties of the specified provisioned product.
    */
  def updateProvisionedProductProperties(params: UpdateProvisionedProductPropertiesInput): Request[UpdateProvisionedProductPropertiesOutput, AWSError] = js.native
  def updateProvisionedProductProperties(
    params: UpdateProvisionedProductPropertiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProvisionedProductPropertiesOutput, Unit]
  ): Request[UpdateProvisionedProductPropertiesOutput, AWSError] = js.native
  
  /**
    * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
    */
  def updateProvisioningArtifact(): Request[UpdateProvisioningArtifactOutput, AWSError] = js.native
  def updateProvisioningArtifact(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProvisioningArtifactOutput, Unit]): Request[UpdateProvisioningArtifactOutput, AWSError] = js.native
  /**
    * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
    */
  def updateProvisioningArtifact(params: UpdateProvisioningArtifactInput): Request[UpdateProvisioningArtifactOutput, AWSError] = js.native
  def updateProvisioningArtifact(
    params: UpdateProvisioningArtifactInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProvisioningArtifactOutput, Unit]
  ): Request[UpdateProvisioningArtifactOutput, AWSError] = js.native
  
  /**
    * Updates a self-service action.
    */
  def updateServiceAction(): Request[UpdateServiceActionOutput, AWSError] = js.native
  def updateServiceAction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceActionOutput, Unit]): Request[UpdateServiceActionOutput, AWSError] = js.native
  /**
    * Updates a self-service action.
    */
  def updateServiceAction(params: UpdateServiceActionInput): Request[UpdateServiceActionOutput, AWSError] = js.native
  def updateServiceAction(
    params: UpdateServiceActionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceActionOutput, Unit]
  ): Request[UpdateServiceActionOutput, AWSError] = js.native
  
  /**
    * Updates the specified TagOption.
    */
  def updateTagOption(): Request[UpdateTagOptionOutput, AWSError] = js.native
  def updateTagOption(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTagOptionOutput, Unit]): Request[UpdateTagOptionOutput, AWSError] = js.native
  /**
    * Updates the specified TagOption.
    */
  def updateTagOption(params: UpdateTagOptionInput): Request[UpdateTagOptionOutput, AWSError] = js.native
  def updateTagOption(
    params: UpdateTagOptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTagOptionOutput, Unit]
  ): Request[UpdateTagOptionOutput, AWSError] = js.native
}
